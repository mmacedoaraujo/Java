package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = input.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("\nFOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\newFolderFromJava").mkdir();
		System.out.println("Directory successfully created: " + success);
		
		input.close();
	}
}
