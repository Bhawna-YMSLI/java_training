package Q1_File_Downloader_Simulation_Using_Threads;

public class DownloadManager {

	public static void main(String[] args) {

		String baseUrl = "https://www.dropbox.com/";

		// Create and start 25 download threads
		for (int i = 1; i <= 25; i++) {
			String fileUrl = baseUrl + "photo" + i + ".jpg";
			Thread t = new Thread(new FileDownloader(fileUrl));
			t.start();
		}
	}
}
