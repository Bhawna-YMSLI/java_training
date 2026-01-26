package Q2;

import java.util.Scanner;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String nic;

	public Owner() {
		name = "";
		nic = "";
		dateOfBirth = new Date();
	}

	public Owner(String name, String nic, Date dateOfBirth) {
		this.name = name;
		this.nic = nic;
		this.dateOfBirth = dateOfBirth;
	}

	public Owner(Owner owner) {
		this.name = owner.name;
		this.nic = owner.nic;
		this.dateOfBirth = new Date(owner.dateOfBirth);
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		this.name = sc.nextLine();

		System.out.print("Enter NIC: ");
		this.nic = sc.nextLine();

		// Date input
		System.out.print("Enter Date of Birth (dd mm yyyy): ");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();

		this.dateOfBirth = new Date(day, month, year);
	}

	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("NIC: " + this.nic);
		System.out.println("Date of Birth: " + this.dateOfBirth);
	}

}
