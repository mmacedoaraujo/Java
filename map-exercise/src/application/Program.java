package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Map<String, Integer> count = new HashMap<>();
		Scanner input = null;
		String path = "C:\\temp\\votes.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String lines = br.readLine();

			while (lines != null) {
				String[] fields = lines.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);

				if (count.containsKey(name)) {
					int countSoFar = count.get(name);
					count.put(name, votes + countSoFar);
				} else {
					count.put(name, votes);
				}
				lines = br.readLine();
			}
			for (String key : count.keySet()) {
				System.out.println(key + ", " + count.get(key));
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
