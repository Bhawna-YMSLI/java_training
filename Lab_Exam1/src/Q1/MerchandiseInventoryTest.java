package Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MerchandiseInventoryTest {

	public static void main(String[] args) {

		ArrayList<Merchandise> list = new ArrayList<>();

		try {
			Scanner sc = new Scanner(new File("input.dat"));

			while (sc.hasNext()) {
				String line = sc.nextLine(); // read whole line
				String[] parts = line.split("\\s+"); // split by space

				String code = parts[0];
				int qty = Integer.parseInt(parts[1]);
				double price = Double.parseDouble(parts[2]);

				list.add(new Merchandise(code, qty, price));
			}

			sc.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return;
		}

		// Sort by item code (ascending)
		Collections.sort(list, new Comparator<Merchandise>() {
			public int compare(Merchandise m1, Merchandise m2) {
				return m1.getItemCode().compareTo(m2.getItemCode());
			}
		});

		System.out.println("Sorted by Item Code (Ascending):");
		for (Merchandise m : list) {
			System.out.println(m);
		}

		// Sort by price (descending)
		Collections.sort(list, new Comparator<Merchandise>() {
			public int compare(Merchandise m1, Merchandise m2) {
				if (m1.getUnitPrice() > m2.getUnitPrice())
					return 1;
				else if (m1.getUnitPrice() < m2.getUnitPrice())
					return -1;
				else
					return 0;
			}
		});

		System.out.println("\nSorted by Price (Descending):");
		for (Merchandise m : list) {
			System.out.println(m);
		}
	}
}
