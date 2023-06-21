package testing;

import java.util.regex.Pattern;

import user_interface.full_example.External;
import user_interface.full_example.UserInterface;

public class P8 implements External{
	public static void main(String[] args) {
		UserInterface ui = new UserInterface(new P8());
		ui.open();
	}

	@Override
	public boolean validMail(String mail) {
		String regexPattern = "^(.+)@(\\S+)$";
		return Pattern.compile(regexPattern)
			      .matcher(mail)
			      .matches();
	}

	@Override
	public boolean validLike(int length, String interests) {
		return interests.split(" ").length == length;
	}
}
