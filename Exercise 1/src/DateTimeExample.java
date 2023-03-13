import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeExample {
	boolean exit = true;

	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the duration ");
		int duration = s1.nextInt();
		System.out.println("Enter the nof times the time and date needs to print");
		int nof_times=s1.nextInt();
		File file=new File("text1.txt");
		if(file.createNewFile()) {
			System.out.println("New file is created");
		}
		PrintWriter pw=new PrintWriter(file);
		for(int i=0;i<nof_times;i++) {
			LocalDateTime obj = LocalDateTime.now();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
			String formatDateTime = obj.format(format);  
			pw.println(formatDateTime);
			pw.flush();
			Thread.sleep(duration * 1000);
		}
		pw.close();
	}
}