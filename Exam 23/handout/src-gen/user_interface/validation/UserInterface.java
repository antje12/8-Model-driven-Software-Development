package user_interface.validation;
	
import javax.swing.*;

public class UserInterface{
	public JFrame frame;

	public void open() {
		frame = new JFrame("Validation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SaveForm form = new SaveForm(this);
		frame.add(form.createPanel());
		frame.pack();
		frame.setVisible(true);
	}
}