package Q3_Object_Serialization_Deserialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	Address address;
	transient double salary; // non-serializable

	public Employee(int id, String name, Address address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	// Display method
	void display() {
		System.out.println("Employee ID   : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Address       : " + address);
		System.out.println("Salary        : " + salary);

	}
}
