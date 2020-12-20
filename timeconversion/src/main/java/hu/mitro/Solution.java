package hu.mitro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Solution {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		if (s.endsWith("AM")) {
			if (s.equals("12:00:00AM")) {
				return "00:00:00";
			}
			return s.substring(s.indexOf("AM"));
		} else {
			if (s.equals("12:00:00PM")) {
				return "12:00:00";
			}
			String temp = s.substring(0, s.indexOf("PM"));
			String[] splitted = temp.split(":");
			int hours = Integer.parseInt(splitted[0]) + 12;
			return hours + ":" + splitted[1] + ":" + splitted[2];
		}
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
