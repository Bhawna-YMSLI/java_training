package Q1_Word_Frequency_Counter_from_File;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		try {

			File file = new File("story.txt");
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String line = sc.nextLine().toLowerCase().trim();
				if (line.isEmpty())
					continue;

				String[] words = line.split("\\s+");

				for (String word : words) {
					map.put(word, map.getOrDefault(word, 0) + 1);
				}
			}
			sc.close();

			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
			}

		} catch (Exception e) {
			System.out.println("Error reading file");
		}
	}
}
