package Q4_Employee_Payment_System;

import java.util.ArrayList;

public class EmployeeApp {
	public static void main(String args[]) {
//		Use ArrayList<Employee>
//		Add at least one of each employee type
//		Loop and print weekly salary using polymorphism

		ArrayList<Employee> employees = new ArrayList<>();

		SalariedEmployee salaried = new SalariedEmployee("Isha", "E001", 5000);
		HourlyEmployee hourly = new HourlyEmployee("Bhawna", "E002", 200);
		CommissionEmployee commission = new CommissionEmployee("Charlie", "E003", 10); // 10% commission

		// Set hoursWorked and totalSales
		hourly.setHoursWorked(40); // 40 hours
		commission.setTotalSales(8000); // total sales ₹8000

		// Add to ArrayList
		employees.add(salaried);
		employees.add(hourly);
		employees.add(commission);

		for (Employee employee : employees) {
			System.out.println(employee.getPayment());
		}
	}

}
