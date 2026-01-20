package Q7_Division_Program_With_Try_Catch_Finally;

import java.util.Scanner;

public class Division_Program {

	public static void main(String args[]) {
//		Prompt user to enter two integers.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int first = scanner.nextInt();
		System.out.print("Enter second  number : ");
		int second = scanner.nextInt();
//		Compute a / b.
		try {
			int divisionResult = first / second;
			System.out.println("The quotient of " + first + " / " + second + " = " + divisionResult);
		} catch (ArithmeticException ae) {
			System.out.println("DivideByZeroException caught");
		} finally {
			System.out.print("Inside finally block");
			scanner.close();
		}

	}

}
