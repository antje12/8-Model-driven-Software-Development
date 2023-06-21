/*
Copyright (c) 2012, Ulrik Pagh Schultz, University of Southern Denmark
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met: 

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer. 
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution. 

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

The views and conclusions contained in the software and documentation are those
of the authors and should not be interpreted as representing official policies, 
either expressed or implied, of the University of Southern Denmark.
 */

package statemachine.year3.dsl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import statemachine.year2.framework.State;
import statemachine.year2.framework.Transition;

/**
 * Abstract class providing a fluent interface for defining a state machine using
 * the generic statemachine framework (year2).  Acts as a builder but also allows the
 * model to be directly interpreted to run the state machine.
 * @author ups
 */
public abstract class FluentMachine {

	//
	// Statemachine metamodel
	//

	private MachineMetaModel metamodel;
	
	public MachineMetaModel getMetaModel() {
		this.buildMachine();
		return metamodel; 
	}

	//
	// Builder infrastructure
	//	

	// Enums defining the types of effects and conditions that can be used

	/**
	 * Effect of a state: set an extended state variable, or change to a different state
	 */
	public enum Effect { SET, CHANGE }
	/**
	 * Condition on a state: variable equal to the given value or greater than the given value
	 */
	public enum Condition { EQUAL, GREATER }

	// Accumulating variables for the builder

	/**
	 * All states that have been defined
	 */
	private List<State<GenericRuntimeState>> states = new ArrayList<>();
	/**
	 * All extended state variables that have been defined
	 */
	private Set<String> variables = new HashSet<>();
	/**
	 *  The current state being built
	 */
	private State<GenericRuntimeState> currentState;
	/**
	 *  The current event that transitions are being defined for
	 */
	private String pendingEvent;
	/**
	 *  The target of the current transition
	 */
	private String targetTransition;
	/**
	 *  The effect of the current transition, if any
	 */
	private Effect effectMaybe;
	/**
	 *  The constant argument to the effect on the current transition, if any
	 */
	private int effectArgument;
	/**
	 *  The name of the mutable state acted upon by the effect on the current transition, if any
	 */
	private String effectVariable;
	/**
	 * A factory object for creating transition instances, overwrite default to control transition creation
	 */
	private TransitionFactory factory = new TransitionFactory();

	/**
	 * Build a machine using the fluent interface.  First call build (overridden in subclass),
	 * then ensure that all transitions associated with the current state have been defined,
	 * and last add the state as the last in the list of states
	 */
	protected void buildMachine() {
		if(metamodel!=null) return;
		build();
		flushTransition(null,null,0);
		if(currentState==null) throw new Error("Empty statemachine definition");
		states.add(currentState);
		checkNameConsistency();
		metamodel = new MachineMetaModel(states,variables);
	}

	/**
	 * Override in subclasses, must define state machine using fluent interface (and initialize state variables)
	 */
	protected abstract void build();

	/**
	 * Start a new state, of the given name
	 */
	public FluentMachine state(String name) {
		if(currentState!=null) {
			flushTransition(null,null,0);
			states.add(currentState);
		}
		currentState = new State<GenericRuntimeState>(name);
		return this;
	}

	/**
	 * Define a new transition, in the context of the current state
	 */
	public FluentMachine transition(String event) {
		if(targetTransition!=null || effectMaybe!=null) flushTransition(null,null,0);
		pendingEvent = event;
		return this;
	}

	/**
	 * Name the target state of the current transition
	 */
	public FluentMachine to(String state) {
		targetTransition = state;
		return this;

	}

	/**
	 * Include a set state effect in the current transition
	 * @param variable the variable to set
	 * @param value the value to set it to
	 */
	public FluentMachine setState(String variableName, int value) {
		effectMaybe = Effect.SET;
		if(!variables.contains(variableName)) throw new Error("Undefined variable: "+variableName);
		effectVariable = variableName;
		effectArgument = value;
		return this;
	}

	/**
	 * Include a change state effect in the current transition
	 * @param variable the variable to change
	 * @param value the value to add to the variable
	 */
	public FluentMachine changeState(String variableName, int value) {
		effectMaybe = Effect.CHANGE;
		if(!variables.contains(variableName)) throw new Error("Undefined variable: "+variableName);
		effectVariable = variableName;
		effectArgument = value;
		return this;
	}

	/**
	 * Add an equals condition to the current transition
	 * @param variable the variable to have a condition on
	 * @param value the value to compare to
	 */
	public FluentMachine whenStateEquals(String variableName, int value) {
		flushTransition(Condition.EQUAL,variableName,value);
		return this;
	}

	/**
	 * Add a comparison condition to the current transition
	 * @param variable the variable to have a condition on
	 * @param value the value to compare to
	 */
	public FluentMachine whenStateGreaterThan(String variableName, int value) {
		flushTransition(Condition.GREATER,variableName,value);
		return this;
	}

	/**
	 * Indicate that a state is a simple alternative (syntactic sugar)
	 */
	public FluentMachine otherwise() {
		flushTransition(null,null,0);
		return this;
	}

	/**
	 * Flush the current transition, in preparation for the start of a new transition or state
	 * @param cond the condition type, if any, on the transition being finalized
	 * @param condVariableMaybe the variable to test on, if any
	 * @param condValue the value to compare to, if any
	 */
	private void flushTransition(Condition cond, String condVariableNameMaybe, int condValue) {
		if(pendingEvent==null) return; // Nothing to flush
		if(targetTransition==null && effectMaybe==null) return; // empty transition
		// Define transition and add to current state
		Transition<GenericRuntimeState> transition = 
				factory.createTransitionHook(targetTransition, 
						effectMaybe, effectVariable, effectArgument, 
						cond, condVariableNameMaybe, condValue);
		currentState.addTransition(pendingEvent, transition);
		// Clear all context variables
		effectMaybe = null;
		effectVariable = null;
		targetTransition = null;
	}

	/**
	 * Change the factory used by the builder to create transition objects
	 * @param factory the new transition factory
	 */
	public void setTransitionFactory(TransitionFactory factory) {
		this.factory = factory;
	}

	/**
	 * Add a new integer state to the state machine
	 * @param name the name of the extended state variable
	 */
	public void integerState(String name) {
		variables.add(name);
	}

	/**
	 * Abstract transition creation for allowing override in DSL variations
	 * @author ups
	 */
	public static class TransitionFactory {
		/**
		 * Hook method allowing the creation of a transition to be changed, as specified by the arguments.
		 * @param target the target of the transition
		 * @param effect the effect of the transition, if any
		 * @param effectVar the variable that the transition has an effect on, if any
		 * @param effectArg the argument of the effect, if any
		 * @param cond the condition of the transition, if any
		 * @param condVariableMaybe the variable used in the condition, if any
		 * @param condValue the value used in the condition, if any
		 * @return a transition object created according to the specification.
		 */
		protected Transition<GenericRuntimeState> createTransitionHook(String target, 
				Effect effect, String effectVarName, int effectArg, 
				Condition cond, String condVariableMaybe, int condValue) {
			return new GenericTransition(target,
					effect,effectVarName,effectArg,
					cond, condVariableMaybe,condValue);
		}
	}

	/**
	 * Check naming consistency, for now just state names
	 */
	private void checkNameConsistency() {
		Set<String> allStateNames = new HashSet<>();
		for(State<GenericRuntimeState> state: states) {
			allStateNames.add(state.getName());
		}
		for(State<GenericRuntimeState> state: states) {
			for(Map.Entry<String,List<Transition<GenericRuntimeState>>> transitionBlob: state.getAllTransitions().entrySet()) {
				for(Transition<GenericRuntimeState> transition: transitionBlob.getValue()) {
					String target = transition.getTarget();
					if(target==null) continue; // Self transition?
					if(!allStateNames.contains(target)) throw new Error("Illegal state name: "+transition.getTarget());
				}
			}
		}
	}

}
