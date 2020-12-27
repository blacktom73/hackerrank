package hu.mitro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts INTEGER_ARRAY grades as parameter.
	 */
	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> results = new ArrayList<>();
		for (Integer grade : grades) {
			if (grade <= 40) {
				if (grade >= 38 && grade < 40) {
					results.add(40);
					continue;
				}
				results.add(grade);
			} else {
				results.add(calculateDifference(grade));
			}
		}
		return results;
	}

	private static int calculateDifference(Integer grade) {
		if (grade % 5 == 0) {
			return grade;
		}
		int nextDivisibleByFive = grade;
		while (nextDivisibleByFive % 5 != 0) {
			nextDivisibleByFive++;
		}
		if (nextDivisibleByFive - grade < 3) {
			return nextDivisibleByFive;
		} else {
			return grade;
		}
	}
}


public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result.gradingStudents(grades);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(joining("\n"))
						+ "\n"
		);

		bufferedReader.close();
		bufferedWriter.close();
	}
}
