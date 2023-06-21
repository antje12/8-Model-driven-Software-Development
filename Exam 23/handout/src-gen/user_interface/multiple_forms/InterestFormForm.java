package user_interface.multiple_forms;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class InterestFormForm extends Form{

	public JTextField learnComponent;
	UserInterface parent;
	
	InterestFormForm(UserInterface parent) {
		this.parent = parent;
		learnComponent = new JTextField();
	}

	public JPanel createPanel(){
		return createPanel9();
	}

	public JPanel createPanel9() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(createPanel10());
		return panel;
	}
	public JPanel createPanel10() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("What do you want to learn?"));
		panel.add(learnComponent);
		return panel;
	}

	public boolean checkValidity(){
		String learn = this.learnComponent.getText();
		if(!(learn.length() >= 5)){
			return false;
		}
		return true;
	}
}
