package Q6_Validate_Name_Age_From_CommandLine_Arguments;

public class InvalidAgeException extends Exception {
	InvalidAgeException(){
		super("Age is not valid") ;
	}
}
