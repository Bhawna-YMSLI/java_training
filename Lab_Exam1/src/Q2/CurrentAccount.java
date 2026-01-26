package Q2;

import java.util.Scanner;

public class CurrentAccount extends Account {
	final private float minimumBalance = 5000;

	// Default constructor
	public CurrentAccount() {
		super();
	}

	// Copy constructor
	public CurrentAccount(CurrentAccount ca) {
		super(ca);
	}

	// Input account details
	public void input() {
		super.input();
	}

	// Print account details
	public void print() {
		super.print();
		System.out.println("Charges (if any): " + getCharges());
	}

	// Calculate charges if balance < minimum
	public float getCharges() {
		float balance = getBalance();
		if (balance < minimumBalance) {

			return (minimumBalance - balance) * 0.05f;
		} else {
			return 0;
		}
	}

	// Deposit money
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		float amount = sc.nextFloat();

		float balance = getBalance();
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraw money
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to withdraw: ");
		float amount = sc.nextFloat();
		
		float balance = getBalance();
		if (amount > 0) {
			if (balance - amount < minimumBalance) {
				System.out.println("Cannot withdraw. Minimum balance requirement not met!");
			} else {
				balance -= amount;
				System.out.println(amount + " withdrawn successfully.");
			}
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}
}
