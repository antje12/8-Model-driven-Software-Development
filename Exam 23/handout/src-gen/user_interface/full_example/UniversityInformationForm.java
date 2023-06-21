package user_interface.full_example;
		
import javax.swing.*;
import java.awt.event.*;
import user_interface.common.*;

public class UniversityInformationForm extends Form{

	public JTextField nameComponent;
	public JTextField acrComponent;
	Form likeForm;
	UserInterface parent;
	External external;
	int acrLength;
	int nameLength;
	
	UniversityInformationForm(UserInterface parent,External external,int acrLength,int nameLength) {
		this.parent = parent;
		this.external= external;
		nameComponent = new JTextField();
		acrComponent = new JTextField();
		this.acrLength = acrLength;
		this.nameLength = nameLength;
	}

	public JPanel createPanel(){
		return createPanel7();
	}

	public JPanel createPanel7() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("University Information"));
		panel.add(createPanel8());
		panel.add(createPanel9());
		likeForm = new LikeFormForm(parent, external);
		panel.add(likeForm.createPanel());
		return panel;
	}
	public JPanel createPanel8() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(new JLabel("University Name"));
		panel.add(nameComponent);
		return panel;
	}
	public JPanel createPanel9() {
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
		if(!likeForm.checkValidity())
			return false;
		return true;
	}
}
