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
		String[] split;
		if (s.endsWith("AM")) {
			if (s.equals("12:00:00AM")) {
				return "00:00:00";
			}
			split = getSplitParts(s, "AM");
			if ((Integer.parseInt(split[0]) == 12 && Integer.parseInt(split[1]) > 0)
					|| (Integer.parseInt(split[0]) == 12 && Integer.parseInt(split[2]) > 0)) {
				return "00:" + split[1] + ":" + split[2];
			}
			return s.substring(0, s.indexOf("AM"));
		} else {
			if (s.equals("12:00:00PM")) {
				return "12:00:00";
			}
			split = getSplitParts(s, "PM");
			if (Integer.parseInt(split[0]) == 12) {
				return split[0] + ":" + split[1] + ":" + split[2];
			}
			return Integer.parseInt(split[0]) + 12 + ":" + split[1] + ":" + split[2];
		}
	}

	private static String[] getSplitParts(String s, String trail) {
		String timeParts = s.substring(0, s.indexOf(trail));
		return timeParts.split(":");
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
