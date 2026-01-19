package Q2;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		day = 1;
		month = 1;
		year = 2026;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}

	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the day : ");
		day = sc.nextInt();
		System.out.print("Enter the month : ");
		month = sc.nextInt();
		System.out.print("Enter the year : ");
		year = sc.nextInt();
		sc.close();
	}

	public void print() {
		System.out.println(day + " " + month + " " + year);
	}

}
