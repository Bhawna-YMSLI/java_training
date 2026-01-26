package Q3_Object_Serialization_Deserialization;

import java.io.*;

public class SerializationDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Rajeev", new Address("Delhi", "India"), 55000.75);

		// -------- Serialization --------
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {

			oos.writeObject(emp);
			System.out.println("Employee object serialized successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// -------- Deserialization --------
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {

			Employee deserializedEmp = (Employee) ois.readObject();

			System.out.println("\nAfter Deserialization:");
			deserializedEmp.display();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
