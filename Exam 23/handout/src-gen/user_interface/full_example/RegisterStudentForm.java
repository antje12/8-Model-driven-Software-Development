package user_interface.full_example;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class RegisterStudentForm extends Form{

	public JButton saveComponent;
	Form personalInformation;
	Form universityInformation;
	UserInterface parent;
	External external;
	
	RegisterStudentForm(UserInterface parent,External external) {
		this.parent = parent;
		this.external= external;
		saveComponent = new JButton("Save");
	}

	public JPanel createPanel(){
		return createPanel1();
	}

	public JPanel createPanel1() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("Registration"));
		personalInformation = new PersonalInformationForm(parent, external, "Student");
		panel.add(personalInformation.createPanel());
		universityInformation = new UniversityInformationForm(parent, external, 3, 10);
		panel.add(universityInformation.createPanel());
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
		return panel;
	}

	public boolean checkValidity(){
		if(!personalInformation.checkValidity())
			return false;
		if(!universityInformation.checkValidity())
			return false;
		return true;
	}
}
