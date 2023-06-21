package user_interface.basic;
	
import javax.swing.*;

public class UserInterface{
	public JFrame frame;

	public void open() {
		frame = new JFrame("Basic");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BasicForm form = new BasicForm(this);
		frame.add(form.createPanel());
		frame.pack();
		frame.setVisible(true);
	}
}