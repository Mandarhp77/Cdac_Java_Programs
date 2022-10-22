package TwoQ1;

public class PasswordTooShortException extends Exception{
	private String msg;
	
	public PasswordTooShortException() {
		msg="Password Should Contains minimum 8 Charactors";
	}
	
	public String getMessage() {
		return msg;
	}
}
