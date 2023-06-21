package metamodel;

public class Transition {

	private String event;
	private State target;

	public Operation operation;
	public String operationVarName;
	public Integer operationSetVal;

	public Condition condition;
	public String conditionVarName;
	public Integer conditionCompVal;

	public Transition(String event, State target) {
		this.event = event;
		this.target = target;
		this.operation = Operation.none;
		this.condition = Condition.none;
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}

	public boolean hasOperation() {
		return operation != Operation.none;
	}

	public Object getOperationVariableName() {
		return operationVarName;
	}

	public boolean hasSetOperation() {
		return operation == Operation.set;
	}

	public boolean hasIncrementOperation() {
		return operation == Operation.increment;
	}

	public boolean hasDecrementOperation() {
		return operation == Operation.decrement;
	}

	public boolean isConditional() {
		return condition != Condition.none;
	}

	public Object getConditionVariableName() {
		return conditionVarName;
	}

	public Integer getConditionComparedValue() {
		return conditionCompVal;
	}

	public boolean isConditionEqual() {
		return condition == Condition.equals;
	}

	public boolean isConditionGreaterThan() {
		return condition == Condition.greaterThan;
	}

	public boolean isConditionLessThan() {
		return condition == Condition.lessThan;
	}
}
