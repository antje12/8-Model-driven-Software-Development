package user_interface.external;
	
import javax.swing.*;

public class UserInterface{
	public JFrame frame;

	External external;
	public UserInterface(External external){
		this.external = external;
	}
	public void open() {
		frame = new JFrame("External");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InformationForm form = new InformationForm(this, external);
		frame.add(form.createPanel());
		frame.pack();
		frame.setVisible(true);
	}
}