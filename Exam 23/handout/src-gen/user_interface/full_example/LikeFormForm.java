package user_interface.full_example;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class LikeFormForm extends Form{

	public JTextField numComponent;
	public JTextField likesComponent;
	UserInterface parent;
	External external;
	
	LikeFormForm(UserInterface parent,External external) {
		this.parent = parent;
		this.external= external;
		numComponent = new JTextField();
		likesComponent = new JTextField();
	}

	public JPanel createPanel(){
		return createPanel10();
	}

	public JPanel createPanel10() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("Next questions will ask about your interests"));
		panel.add(createPanel11());
		panel.add(createPanel12());
		return panel;
	}
	public JPanel createPanel11() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("How many interests will you share?"));
		panel.add(numComponent);
		return panel;
	}
	public JPanel createPanel12() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("What are your interests (space divided)?"));
		panel.add(likesComponent);
		return panel;
	}

	public boolean checkValidity(){
		int num = 0;
		try {
			num = Integer.parseInt(this.numComponent.getText());
		} catch (Exception ex) {
			return false;
		}
		String likes = this.likesComponent.getText();
		if(!((likes.length() >= 0) && external.validLike(num, likes))){
			return false;
		}
		return true;
	}
}
