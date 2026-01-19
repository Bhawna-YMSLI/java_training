package Q4_Employee_Payment_System;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(String name, String employeeId, double weeklySalary) {
		super(name, employeeId);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPayment() {
		return weeklySalary;
	}
}
