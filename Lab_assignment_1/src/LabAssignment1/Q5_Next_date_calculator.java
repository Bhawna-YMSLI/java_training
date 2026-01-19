package LabAssignment1;

//Requirements

//Input day, month, year from the user.
//Validate the date.
//Compute the next day’s date manually.
//Display both dates.

//Sample Output
//Enter day: 31
//Enter month: 12
//Enter year: 2022
//Today: 31/12/2022
//Next Date: 1/1/2023

//Validations Required

//Correct days for each month
//Leap year logic: (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
//Month-end transitions
//Year-end transition

import java.util.Scanner;

public class Q5_Next_date_calculator {

	// Check leap year
	static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	// Get number of days in a month
	static int daysInMonth(int month, int year) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear(year) ? 29 : 28;
		default:
			return -1;
		}
	}

	// Validate date
	static boolean isValidDate(int day, int month, int year) {
		if (year <= 0 || month < 1 || month > 12) {
			return false;
		}
		int maxDays = daysInMonth(month, year);
		return day >= 1 && day <= maxDays;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter day: ");
		int day = sc.nextInt();

		System.out.print("Enter month: ");
		int month = sc.nextInt();

		System.out.print("Enter year: ");
		int year = sc.nextInt();

		// Validate input date
		if (!isValidDate(day, month, year)) {
			System.out.println("Invalid date entered.");
			return;
		}

		System.out.println("Today: " + day + "/" + month + "/" + year);

		// Calculate next date
		int nextDay = day;
		int nextMonth = month;
		int nextYear = year;

		if (day < daysInMonth(month, year)) {
			nextDay++;
		} else {
			nextDay = 1;
			if (month < 12) {
				nextMonth++;
			} else {
				nextMonth = 1;
				nextYear++;
			}
		}

		System.out.println("Next Date: " + nextDay + "/" + nextMonth + "/" + nextYear);

		sc.close();
	}
}
