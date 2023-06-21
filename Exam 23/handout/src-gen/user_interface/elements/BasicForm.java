package user_interface.elements;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class BasicForm extends Form{

	public JTextField nameComponent;
	public JButton saveComponent;
	UserInterface parent;
	
	BasicForm(UserInterface parent) {
		this.parent = parent;
		nameComponent = new JTextField();
		saveComponent = new JButton("Valid");
	}

	public JPanel createPanel(){
		return createPanel1();
	}

	public JPanel createPanel1() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("I am a label"));
		panel.add(nameComponent);
		panel.add(saveComponent);
		return panel;
	}

	public boolean checkValidity(){
		String name = this.nameComponent.getText();
		return true;
	}
}
