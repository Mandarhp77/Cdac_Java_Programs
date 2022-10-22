package TwoQ2;

public class UserRegistration {
	private String username;
	private String country;

	public UserRegistration() {

	}
	
	public UserRegistration(String username, String country) {
		this.username = username;
		this.country = country;
	}

	
	public void RegisterUser(String username, String country) throws InvalidCountryException {
		this.username = username;
		this.country = country;

		if (country == "India" | country == "india" | country == "INDIA") {
			System.out.println("Bharat me apka swgat hai " + username);
		} else {
			throw new InvalidCountryException();
		}
	}
}
