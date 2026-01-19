package Q3_Read_Doubles_from_File_and_Find_Maximum_Value;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Requirements
//Create a file named data.txt containing double values, one per line.
//Read all double values using a Scanner or BufferedReader.
//Store values in a List<Double>.
//Find and print the largest double.

public class FindMaximum {
	public static void main(String args[]) {
		try {

			File file = new File("data.txt");
			Scanner scanner = new Scanner(file);
			List<Double> list = new ArrayList<>();

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (!line.isBlank()) {
					try {
						double value = Double.parseDouble(line);
						list.add(value);
					} catch (NumberFormatException e) {
						// invalid number, skip this line
					}
				}
			}
			scanner.close();
			if (list.isEmpty()) {
				System.out.println("File is empty");
				return;
			}
			double max = list.get(0);

			for (double value : list) {
				if (value > max) {
					max = value;
				}
			}

			System.out.println("Max is : " + max);
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		}
	}
}
