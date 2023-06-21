package examples.decisiondiagram.metamodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Questions are a special kind of target where options are presented to the user
 * @author ups
 *
 */
public class Question extends Target {
	
	public Question(String name, String text) {
		super(name,text);
	}

	private List<Option> options = new ArrayList<Option>();

	public List<Option> getOptions() {
		return options;
	}

	public void addOption(Option currentOption) {
		options.add(currentOption);
	}
}
