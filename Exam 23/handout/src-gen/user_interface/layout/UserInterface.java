package user_interface.layout;
	
import javax.swing.*;

public class UserInterface{
	public JFrame frame;

	public void open() {
		frame = new JFrame("Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BasicForm form = new BasicForm(this);
		frame.add(form.createPanel());
		frame.pack();
		frame.setVisible(true);
	}
}