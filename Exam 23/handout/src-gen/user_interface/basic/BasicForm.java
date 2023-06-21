package user_interface.basic;
		
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
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("My first form"));
		return panel;
	}

	public boolean checkValidity(){
		return true;
	}
}
