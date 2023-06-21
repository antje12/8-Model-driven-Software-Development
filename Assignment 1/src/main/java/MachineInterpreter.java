import metamodel.Machine;
import metamodel.State;
import metamodel.Transition;

public class MachineInterpreter {
	private Machine machine;
	private State currentState;

	public void run(Machine machine) {
		this.machine = machine;
		this.currentState = machine.getInitialState();
	}

	public State getCurrentState() {
		return currentState;
	}

	public void processEvent(String event) {
		for (Transition t : currentState.getTransitions()) {
			if (t.getEvent().equals(event)) {

				if (t.isConditional()) {
					Integer var = machine.getInteger(t.conditionVarName);
					switch (t.condition) {
					case equals:
						if (var != t.conditionCompVal) {
							continue;
						}
						break;
					case greaterThan:
						if (var <= t.conditionCompVal) {
							continue;
						}
						break;
					case lessThan:
						if (var >= t.conditionCompVal) {
							continue;
						}
						break;
					default:
					}
				}

				if (t.hasOperation()) {
					switch (t.operation) {
					case set:
						machine.setInteger(t.operationVarName, t.operationSetVal);
						break;
					case increment:
						machine.incrementInteger(t.operationVarName);
						break;
					case decrement:
						machine.decrementInteger(t.operationVarName);
						break;
					default:
					}
				}

				currentState = t.getTarget();
				return;
			}
		}
	}

	public int getInteger(String var) {
		return machine.hasInteger(var) ? machine.getInteger(var) : 0;
	}
}
