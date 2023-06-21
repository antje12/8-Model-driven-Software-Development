package user_interface.multiple_forms;
	
import javax.swing.*;

public class UserInterface{
	public JFrame frame;

	public void open() {
		frame = new JFrame("MultipleForms");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RegisterStudentForm form = new RegisterStudentForm(this);
		frame.add(form.createPanel());
		frame.pack();
		frame.setVisible(true);
	}
}