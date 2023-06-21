package user_interface.external;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class InformationForm extends Form{

	public JTextField nameComponent;
	public JTextField mailComponent;
	public JButton validComponent;
	UserInterface parent;
	External external;
	
	InformationForm(UserInterface parent,External external) {
		this.parent = parent;
		this.external= external;
		nameComponent = new JTextField();
		mailComponent = new JTextField();
		validComponent = new JButton("Save");
	}

	public JPanel createPanel(){
		return createPanel1();
	}

	public JPanel createPanel1() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(createPanel2());
		panel.add(createPanel3());
		panel.add(validComponent);
		validComponent.addActionListener(new ActionListener(){
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
		panel.add(new JLabel("Mail"));
		panel.add(mailComponent);
		return panel;
	}

	public boolean checkValidity(){
		String name = this.nameComponent.getText();
		String mail = this.mailComponent.getText();
		if(!external.validMail(mail)){
			return false;
		}
		return true;
	}
}
