package user_interface.elements;
	
import javax.swing.*;

public class UserInterface{
	public JFrame frame;

	public void open() {
		frame = new JFrame("Elements");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BasicForm form = new BasicForm(this);
		frame.add(form.createPanel());
		frame.pack();
		frame.setVisible(true);
	}
}