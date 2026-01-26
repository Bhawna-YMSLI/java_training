package Q5_User_Registration_With_Custom_Exception;

public class InvalidCountryException extends Exception {

	// Default constructor
	public InvalidCountryException() {
		super("User outside India cannot be registered");
	}

	// Overloaded constructor with custom message
	public InvalidCountryException(String message) {
		super(message);
	}
}
