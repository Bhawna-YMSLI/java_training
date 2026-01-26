package Q2;

import java.util.Scanner;

public class SavingAccount extends Account {
	private float interestRate; // interest rate for the saving account

	// Default constructor
	public SavingAccount() {
		super(); // call Account default constructor
		interestRate = 0; // default interest
	}

	// Parameterized constructor
	public SavingAccount(Owner owner, float balance, String number, float interestRate) {
		super(owner, balance, number); // call Account constructor
		this.interestRate = interestRate;
	}

	// Copy constructor
	public SavingAccount(SavingAccount sa) {
		super(sa); // copy Account part
		this.interestRate = sa.interestRate; // copy interest
	}

	// Input method
	public void input() {
		super.input(); // input Owner, balance, number

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter interest rate (%): ");
		interestRate = sc.nextFloat();
		sc.nextLine();  
		sc.close();
	}

	// Print method
	public void print() {
		super.print(); // print Owner, balance, number
		System.out.println("Interest Rate: " + interestRate + "%");
	}

	 
	public float getInterestRate() {
		return interestRate;
	}

	 
	@Override
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		float amt = sc.nextFloat();
		setBalance(getBalance() + amt);
		System.out.println("Amount deposited successfully!");
		sc.close();
	}

	@Override
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to withdraw: ");
		float amt = sc.nextFloat();
		if (amt > getBalance()) {
			System.out.println("Insufficient balance!");
		} else {
			setBalance(getBalance() - amt);
			System.out.println("Amount withdrawn successfully!");
		}
		sc.close();
	}
}
