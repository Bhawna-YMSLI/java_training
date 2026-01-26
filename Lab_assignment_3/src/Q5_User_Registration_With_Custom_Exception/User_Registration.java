package Q5_User_Registration_With_Custom_Exception;

public class User_Registration {

//		If userCountry is not "India" → throw InvalidCountryException
//		Else print: User registration done successfully
	static void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!"India".equalsIgnoreCase(userCountry)) {
			throw new InvalidCountryException();
		}
		System.out.println("User registration done successfully for username : " + username);

	}

	public static void main(String[] args) {
		try {
			registerUser("Bhawna@160", "India");
			registerUser("Kartik@160", "Austrlia");

		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}
