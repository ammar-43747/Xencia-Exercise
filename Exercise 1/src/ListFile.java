import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ListFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the directory path");
		String dPath = scanner.next();
		System.out.println("Enter the path to create the text file");
		String destPath = scanner.next();
		File file = new File(destPath + "\\Record.txt");
		if (file.createNewFile()) {
			System.out.println("New file created as 'Record.txt' ");
		}
		PrintWriter pw=new PrintWriter(file);
		File readFile = new File(dPath);
		ListFile list = new ListFile();
		if (readFile.exists() && readFile.isDirectory()) {
			File[] a = readFile.listFiles();
			for (int i = 0; i < a.length; i++) {
				if(a[i].isDirectory()) {
					pw.println(a[i].getName());
					pw.flush();
				File dir=new File(a[i].getPath());
				File b[]=dir.listFiles();
				for(int j=0;j<b.length;j++) {
					pw.println("    "+b[j].getName());
					pw.flush();
				}
				}
				else {
					pw.println(a[i].getName());
					pw.flush();
				}
			}
		}
		pw.close();
	}

}
