package Q1_File_Downloader_Simulation_Using_Threads;

import java.util.Random;

class FileDownloader implements Runnable {

	private String fileUrl;
	private static final Random rand = new Random();

	public FileDownloader(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public void run() {
		String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);

		// Print starting message
		System.out.println("Starting download: " + fileName);

		try {
			// Simulate download time (200–500 ms)
			Thread.sleep(200 + rand.nextInt(301));
		} catch (InterruptedException e) {
			System.out.println("Download interrupted: " + fileName);
		}

		// Print completed message
		System.out.println("Completed: " + fileName);
	}
}
