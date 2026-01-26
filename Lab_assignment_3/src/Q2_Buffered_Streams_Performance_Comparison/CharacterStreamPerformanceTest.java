package Q2_Buffered_Streams_Performance_Comparison;

import java.io.*;

public class CharacterStreamPerformanceTest {
	public static void main(String[] args) {

		File source = new File("source.txt");
		File destWithoutBuffer = new File("char_no_buffer.txt");
		File destWithBuffer = new File("char_with_buffer.txt");

		long startTime;
		long endTime;

		// ---------- Without Buffering ----------
		startTime = System.currentTimeMillis();
		copyWithoutBuffer(source, destWithoutBuffer);
		endTime = System.currentTimeMillis();
		long timeWithoutBuffer = endTime - startTime;

		// ---------- With Buffering ----------
		startTime = System.currentTimeMillis();
		copyWithBuffer(source, destWithBuffer);
		endTime = System.currentTimeMillis();
		long timeWithBuffer = endTime - startTime;

		// ---------- Result ----------
		System.out.println("Without Buffering: " + timeWithoutBuffer + " ms");
		System.out.println("With Buffering: " + timeWithBuffer + " ms");
		System.out.println("Performance improved by: " + (timeWithoutBuffer - timeWithBuffer) + " ms");
	}

	private static void copyWithoutBuffer(File source, File destination) {
		try (FileReader reader = new FileReader(source); FileWriter writer = new FileWriter(destination)) {

			int data;
			while ((data = reader.read()) != -1) {
				writer.write(data);
			}

		} catch (IOException e) {
			System.err.println("Error (non-buffered): " + e.getMessage());
		}
	}

	private static void copyWithBuffer(File source, File destination) {
		try (BufferedReader reader = new BufferedReader(new FileReader(source));
				BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {

			int data;
			while ((data = reader.read()) != -1) {
				writer.write(data);
			}

		} catch (IOException e) {
			System.err.println("Error (buffered): " + e.getMessage());
		}
	}
}
