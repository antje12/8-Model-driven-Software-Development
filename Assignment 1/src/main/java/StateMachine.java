import java.util.HashMap;

import metamodel.Machine;
import metamodel.State;
import metamodel.Transition;
import metamodel.Condition;
import metamodel.Operation;

public class StateMachine {
	private HashMap<String, State> states = new HashMap<>();
	private State currentState;
	private State initialState;
	private String currentEvent;

	private HashMap<String, Integer> integers = new HashMap<>();

	private Transition currentTransition;

	private State getOrCreateState(String state) {
		if (states.containsKey(state)) {
			return states.get(state);
		}
		State newState = new State(state);
		states.put(state, newState);
		return newState;
	}

	private Integer getOrCreateInteger(String var) {
		if (integers.containsKey(var)) {
			return integers.get(var);
		}
		integers.put(var, 0);
		return 0;
	}

	public Machine build() {
		return new Machine(states, initialState, integers);
	}

	public StateMachine state(String state) {
		currentState = getOrCreateState(state);
		return this;
	}

	public StateMachine initial() {
		initialState = currentState;
		return this;
	}

	public StateMachine when(String event) {
		currentEvent = event;
		return this;
	}

	public StateMachine to(String state) {
		Transition trans = new Transition(currentEvent, getOrCreateState(state));
		currentState.addTransition(trans);
		currentTransition = trans;
		return this;
	}

	public StateMachine integer(String var) {
		getOrCreateInteger(var);
		return this;
	}

	public StateMachine set(String var, int num) {
		currentTransition.operation = Operation.set;
		currentTransition.operationVarName = var;
		currentTransition.operationSetVal = num;
		return this;
	}

	public StateMachine increment(String var) {
		currentTransition.operation = Operation.increment;
		currentTransition.operationVarName = var;
		return this;
	}

	public StateMachine decrement(String var) {
		currentTransition.operation = Operation.decrement;
		currentTransition.operationVarName = var;
		return this;
	}

	public StateMachine ifEquals(String var, int num) {
		currentTransition.condition = Condition.equals;
		currentTransition.conditionVarName = var;
		currentTransition.conditionCompVal = num;
		return this;
	}

	public StateMachine ifGreaterThan(String var, int num) {
		currentTransition.condition = Condition.greaterThan;
		currentTransition.conditionVarName = var;
		currentTransition.conditionCompVal = num;
		return this;
	}

	public StateMachine ifLessThan(String var, int num) {
		currentTransition.condition = Condition.lessThan;
		currentTransition.conditionVarName = var;
		currentTransition.conditionCompVal = num;
		return this;
	}
}
