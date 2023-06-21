package user_interface.full_example;
	
import javax.swing.*;

public class UserInterface{
	public JFrame frame;

	External external;
	public UserInterface(External external){
		this.external = external;
	}
	public void open() {
		frame = new JFrame("FullExample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RegisterStudentForm form = new RegisterStudentForm(this, external);
		frame.add(form.createPanel());
		frame.pack();
		frame.setVisible(true);
	}
}