package examples.decisiondiagram.metamodel;

/**
 * An option is attached to a question, and has question text and a target
 * @author ups
 *
 */
public class Option {
	public Option(String text2) {
		text = text2;
	}
	private String text;
	private String targetName;
	private Target target;
	public void setTargetName(String target_name) {
		targetName = target_name;
		
	}
	public String getTargetName() {
		return targetName;
	}
	public void setTarget(Target target) {
		this.target = target;
	}
	public String getText() {
		return text;
	}
	public Target getTarget() {
		return target;
	}
}
