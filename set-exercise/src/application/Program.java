package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter file full path: ");
		String path = input.nextLine();

		try (BufferedReader buffread = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = buffread.readLine();

			while (line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				set.add(new LogEntry(username, moment));

				line = buffread.readLine();
			}
			
			for (LogEntry c : set) {
				System.out.println(c.getUserName());
			}
			System.out.println();
			System.out.println("Total users: " + set.size());
			
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
