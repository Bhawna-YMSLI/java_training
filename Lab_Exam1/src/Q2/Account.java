package Q2;

import java.util.Scanner;

public abstract class Account {
	private Owner owner;
	private float balance;
	private String number;

	public Account() {
		owner = new Owner();
		balance = 0;
		number = "";
	}

	public Account(Owner owner, float balance, String number) {
		this.owner = new Owner(owner);
		this.balance = balance;
		this.number = number;
	}

	public Account(Account account) {
		this.owner = new Owner(account.owner);
		this.balance = account.balance;
		this.number = account.number;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the owner : ");

		owner = new Owner(); // create new Owner object
		owner.input(); // Owner's input method

		System.out.print("Enter the balance  : ");
		balance = sc.nextFloat();
		System.out.print("Enter the account number  : ");
		number = sc.nextLine();
		sc.close();

	}

	public void print() {
		owner.print();
		System.out.println(" Balance : " + balance + "Account number : " + number);
	}

	public abstract void deposit();

	public abstract void withdraw();

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
}
