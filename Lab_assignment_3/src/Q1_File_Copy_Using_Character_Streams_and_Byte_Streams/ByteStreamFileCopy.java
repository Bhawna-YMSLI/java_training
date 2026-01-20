package Q1_File_Copy_Using_Character_Streams_and_Byte_Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamFileCopy {
	public static void main(String[] args) {

		File sourceFile = new File("source_byte_stream.txt");
		File destinationFile = new File("destination_byte_stream.txt");

		// Try-with-resources for automatic resource management
		try (FileInputStream inputStream = new FileInputStream(sourceFile);
				FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

			int byteData;
			while ((byteData = inputStream.read()) != -1) {
				outputStream.write(byteData);
			}

			outputStream.flush();
			validateCopy(sourceFile, destinationFile);

		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("I/O error occurred: " + e.getMessage());
		}
	}

	private static void validateCopy(File original, File copied) {
		if (copied.exists() && original.length() == copied.length()) {
			System.out.println("Byte stream copy successful.");
			System.out.println("File size: " + copied.length() + " bytes");
		} else {
			System.out.println("File copy failed or size mismatch.");
		}
	}
}
