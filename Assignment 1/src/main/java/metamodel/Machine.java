package metamodel;

import java.util.List;
import java.util.HashMap;
import static java.util.stream.Collectors.toList;

public class Machine {
	private HashMap<String, State> states;
	private State initialState;
	private HashMap<String, Integer> integers;

	public Machine(HashMap<String, State> states, State initialState, HashMap<String, Integer> integers) {
		this.states = states;
		this.initialState = initialState;
		this.integers = integers;
	}

	public List<State> getStates() {
		return states.values().stream().collect(toList());
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String state) {
		return states.get(state);
	}

	public int numberOfIntegers() {
		return integers.size();
	}

	public boolean hasInteger(String var) {
		return integers.containsKey(var);
	}

	public Integer getInteger(String var) {
		return integers.get(var);
	}

	public Integer setInteger(String var, int num) {
		return integers.put(var, num);
	}

	public Integer incrementInteger(String var) {
		Integer i = getInteger(var);
		i = i + 1;
		return integers.put(var, i);
	}

	public Integer decrementInteger(String var) {
		Integer i = getInteger(var);
		i = i - 1;
		return integers.put(var, i);
	}
}
