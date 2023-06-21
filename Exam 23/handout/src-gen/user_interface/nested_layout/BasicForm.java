package user_interface.nested_layout;
		
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
		panel.add(createPanel2());
		panel.add(createPanel3());
		panel.add(new JLabel("Very Down"));
		return panel;
	}
	public JPanel createPanel2() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Up Left"));
		panel.add(new JLabel(" Up Right"));
		return panel;
	}
	public JPanel createPanel3() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Middle Left"));
		panel.add(new JLabel("Middle Right"));
		panel.add(createPanel4());
		return panel;
	}
	public JPanel createPanel4() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("One more"));
		panel.add(new JLabel("Another more"));
		return panel;
	}

	public boolean checkValidity(){
		return true;
	}
}
