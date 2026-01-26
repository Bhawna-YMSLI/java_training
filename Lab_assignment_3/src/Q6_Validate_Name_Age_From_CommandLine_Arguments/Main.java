package Q6_Validate_Name_Age_From_CommandLine_Arguments;

public class Main {
	static void validateAge(int ageInput) throws InvalidAgeException {
		if (ageInput < 18 || ageInput >= 60) {
			throw new InvalidAgeException();
		}
	}

	public static void main(String args[]) {

		// Check if enough arguments are provided
		if (args.length < 2) {
			System.out.println("Usage: java CommandLineUser <username> <age>");
			return;
		}
		String username = args[0];
		String ageInput = args[1];
		try {
			int age = Integer.parseInt(ageInput);

			validateAge(age);

			// Valid case
			System.out.println("Name: " + username + ", Age: " + age);

		} catch (NumberFormatException e) {
			System.out.println("Invalid input: Age must be a number.");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}
}
