package TwoQ1;

public class PasswordTooLongException extends Exception {
	public String msg;
	
	public PasswordTooLongException() {
		msg = "Password Should contains maximum 12 Charactors";
	}
	
	public String getMessage() {
		return msg;
	}

}
