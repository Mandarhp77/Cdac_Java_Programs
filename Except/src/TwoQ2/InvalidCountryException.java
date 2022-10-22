package TwoQ2;

public class InvalidCountryException extends Exception {
	private String message;
	public InvalidCountryException() {
		message = "Foreigners bhag yah se";
	}
	
	public String getMessage() {
		return message;
	}
}
