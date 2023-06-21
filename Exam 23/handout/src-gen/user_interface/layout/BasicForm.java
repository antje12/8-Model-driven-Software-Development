package user_interface.layout;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class BasicForm extends Form{

	UserInterface parent;
	
	BasicForm(UserInterface parent) {
		this.parent = parent;
	}

	public JPanel createPanel(){
		return createPanel1();
	}

	public JPanel createPanel1() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Left"));
		panel.add(new JLabel("Right"));
		return panel;
	}

	public boolean checkValidity(){
		return true;
	}
}
