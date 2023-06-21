package testing;

import user_interface.external.UserInterface;

import java.util.regex.Pattern;

import user_interface.external.External;

public class P7 implements External{
	public static void main(String[] args) {
		UserInterface ui = new UserInterface(new P7());
		ui.open();
	}

	@Override
	public boolean validMail(String mail) {
		String regexPattern = "^(.+)@(\\S+)$";
		return Pattern.compile(regexPattern)
			      .matcher(mail)
			      .matches();
	}
}
