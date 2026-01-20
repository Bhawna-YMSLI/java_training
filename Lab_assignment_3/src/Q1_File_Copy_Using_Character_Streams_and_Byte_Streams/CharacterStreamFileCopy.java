package Q1_File_Copy_Using_Character_Streams_and_Byte_Streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharacterStreamFileCopy {
	public static void main(String[] args) {

		File sourceFile = new File("source.txt");
		File destinationFile = new File("destination_char_copy.txt");

		// Try-with-resources ensures streams are closed automatically
		try (FileReader reader = new FileReader(sourceFile); FileWriter writer = new FileWriter(destinationFile)) {

			int character;
			while ((character = reader.read()) != -1) {
				writer.write(character);
			}

			validateCopy(sourceFile, destinationFile);

		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("I/O error occurred: " + e.getMessage());
		}
	}

	private static void validateCopy(File original, File copied) {
		if (copied.exists()) {
			System.out.println("Character stream copy successful.");

		} else {
			System.out.println("File copy failed or size mismatch.");
		}
	}
}
