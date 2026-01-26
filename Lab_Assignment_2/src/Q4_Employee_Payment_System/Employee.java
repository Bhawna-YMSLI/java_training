package Q4_Employee_Payment_System;

import Q5_Unified_Payment_System.Payable;

public abstract class Employee implements Payable {
//	Include:
//	    Common attributes: name, employeeId
//		Abstract getPayment() or overridden method
	private String name;
	private String employeeId;

	public Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public abstract double getPayment();

}
