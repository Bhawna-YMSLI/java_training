package Q2_Buffered_Streams_Performance_Comparison;

import java.io.*;

public class ByteStreamPerformanceTest {
	public static void main(String[] args) {

		File source = new File("source.txt");
		File destWithoutBuffer = new File("byte_no_buffer.txt");
		File destWithBuffer = new File("byte_with_buffer.txt");

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
		try (FileInputStream in = new FileInputStream(source);
				FileOutputStream out = new FileOutputStream(destination)) {

			int data;
			while ((data = in.read()) != -1) {
				out.write(data);
			}

		} catch (IOException e) {
			System.err.println("Error (non-buffered): " + e.getMessage());
		}
	}

	private static void copyWithBuffer(File source, File destination) {
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {

			int data;
			while ((data = in.read()) != -1) {
				out.write(data);
			}

		} catch (IOException e) {
			System.err.println("Error (buffered): " + e.getMessage());
		}
	}
}
