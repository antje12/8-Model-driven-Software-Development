package user_interface.multiple_forms;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class UniversityInformationForm extends Form{

	public JTextField nameComponent;
	public JTextField acrComponent;
	UserInterface parent;
	int acrLength;
	int nameLength;
	
	UniversityInformationForm(UserInterface parent,int acrLength,int nameLength) {
		this.parent = parent;
		nameComponent = new JTextField();
		acrComponent = new JTextField();
		this.acrLength = acrLength;
		this.nameLength = nameLength;
	}

	public JPanel createPanel(){
		return createPanel6();
	}

	public JPanel createPanel6() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("University Information"));
		panel.add(createPanel7());
		panel.add(createPanel8());
		return panel;
	}
	public JPanel createPanel7() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("University Name"));
		panel.add(nameComponent);
		return panel;
	}
	public JPanel createPanel8() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("Acronym"));
		panel.add(acrComponent);
		return panel;
	}

	public boolean checkValidity(){
		String name = this.nameComponent.getText();
		if(!(name.length() <= nameLength)){
			return false;
		}
		String acr = this.acrComponent.getText();
		if(!(acrLength >= acr.length())){
			return false;
		}
		return true;
	}
}
