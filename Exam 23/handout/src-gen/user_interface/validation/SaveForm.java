package user_interface.validation;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class SaveForm extends Form{

	public JTextField nameComponent;
	public JTextField ageComponent;
	public JTextField passwordComponent;
	public JTextField repeatPasswordComponent;
	public JButton saveComponent;
	public JButton cancelComponent;
	UserInterface parent;
	
	SaveForm(UserInterface parent) {
		this.parent = parent;
		nameComponent = new JTextField();
		ageComponent = new JTextField();
		passwordComponent = new JTextField();
		repeatPasswordComponent = new JTextField();
		saveComponent = new JButton("Save");
		cancelComponent = new JButton("Cancel");
	}

	public JPanel createPanel(){
		return createPanel1();
	}

	public JPanel createPanel1() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(createPanel2());
		panel.add(createPanel3());
		panel.add(createPanel4());
		panel.add(createPanel5());
		panel.add(createPanel6());
		return panel;
	}
	public JPanel createPanel2() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Name"));
		panel.add(nameComponent);
		return panel;
	}
	public JPanel createPanel3() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Age"));
		panel.add(ageComponent);
		return panel;
	}
	public JPanel createPanel4() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Password"));
		panel.add(passwordComponent);
		return panel;
	}
	public JPanel createPanel5() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Repeat Password"));
		panel.add(repeatPasswordComponent);
		return panel;
	}
	public JPanel createPanel6() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(saveComponent);
		saveComponent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(checkValidity()){
					JOptionPane.showMessageDialog(
						parent.frame, 
						"Data has been saved");
				}
				else {
					JOptionPane.showMessageDialog(
						parent.frame, 
						"Validation Error", 
						"Error",
						JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(cancelComponent);
		return panel;
	}

	public boolean checkValidity(){
		String name = this.nameComponent.getText();
		int age = 0;
		try {
			age = Integer.parseInt(this.ageComponent.getText());
			if(!((age > 18) && (age <= 75))){
				return false;
			}
		} catch (Exception ex) {
			return false;
		}
		String password = this.passwordComponent.getText();
		if(!(password.length() > 8)){
			return false;
		}
		String repeatPassword = this.repeatPasswordComponent.getText();
		if(!(password).equals(repeatPassword)){
			return false;
		}
		return true;
	}
}
