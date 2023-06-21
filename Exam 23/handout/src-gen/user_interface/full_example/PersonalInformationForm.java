package user_interface.full_example;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class PersonalInformationForm extends Form{

	public JTextField firstNameComponent;
	public JTextField lastNameComponent;
	public JTextField ageComponent;
	public JTextField mailComponent;
	UserInterface parent;
	External external;
	String name;
	
	PersonalInformationForm(UserInterface parent,External external,String name) {
		this.parent = parent;
		this.external= external;
		firstNameComponent = new JTextField();
		lastNameComponent = new JTextField();
		ageComponent = new JTextField();
		mailComponent = new JTextField();
		this.name = name;
	}

	public JPanel createPanel(){
		return createPanel2();
	}

	public JPanel createPanel2() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel((("Fill with " + name) + " Information")));
		panel.add(createPanel3());
		panel.add(createPanel4());
		panel.add(createPanel5());
		panel.add(createPanel6());
		return panel;
	}
	public JPanel createPanel3() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Name"));
		panel.add(firstNameComponent);
		return panel;
	}
	public JPanel createPanel4() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Last Name"));
		panel.add(lastNameComponent);
		return panel;
	}
	public JPanel createPanel5() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Age"));
		panel.add(ageComponent);
		return panel;
	}
	public JPanel createPanel6() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Mail"));
		panel.add(mailComponent);
		return panel;
	}

	public boolean checkValidity(){
		String firstName = this.firstNameComponent.getText();
		String lastName = this.lastNameComponent.getText();
		if(!!(firstName).equals(lastName)){
			return false;
		}
		int age = 0;
		try {
			age = Integer.parseInt(this.ageComponent.getText());
			if(!(age > 18)){
				return false;
			}
		} catch (Exception ex) {
			return false;
		}
		String mail = this.mailComponent.getText();
		if(!external.validMail(mail)){
			return false;
		}
		return true;
	}
}
