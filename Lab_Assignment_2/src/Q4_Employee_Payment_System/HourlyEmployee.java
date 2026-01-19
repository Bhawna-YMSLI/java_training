package Q4_Employee_Payment_System;

public class HourlyEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public HourlyEmployee(String name, String employeeId, double hourlyRate) {
		super(name, employeeId);
		hoursWorked = 0;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double getPayment() {
		return hoursWorked * hourlyRate;
	}

	// We need a setter to set hours worked
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}
