package metamodel;

import java.util.List;
import java.util.ArrayList;

public class State {
	private String name;
	private List<Transition> transitions;

	public State(String name) {
		this.name = name;
		this.transitions = new ArrayList<Transition>();
	}

	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public void addTransition(Transition trans) {
		transitions.add(trans);
	}

	public Transition getTransitionByEvent(String event) {
		return transitions.stream().filter(t -> t.getEvent().equals(event)).findFirst().get();
	}
}
