package hu.mitro;

import java.util.Scanner;


public class Solution {

	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int[] applesDistance = calculateFruitDistance(a, apples);
		int[] orangesDistance = calculateFruitDistance(b, oranges);
		int foundApples = checkFruitDistance(s, t, applesDistance);
		int foundOranges = checkFruitDistance(s, t, orangesDistance);
		System.out.println(foundApples);
		System.out.println(foundOranges);
	}

	private static int[] calculateFruitDistance(int treePosition, int[] appels) {
		int length = appels.length;
		int[] fit = new int[length];
		for (int i = 0; i < length; i++) {
			fit[i] = appels[i] + treePosition;
		}
		return fit;
	}

	private static int checkFruitDistance(int s, int t, int[] fruitsDistance) {
		int foundFruits = 0;
		for (int i = 0; i < fruitsDistance.length; i++) {
			if (fruitsDistance[i] >= s && fruitsDistance[i] <= t) {
				foundFruits++;
			}
		}
		return foundFruits;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] st = scanner.nextLine().split(" ");
		int s = Integer.parseInt(st[0]);
		int t = Integer.parseInt(st[1]);

		String[] ab = scanner.nextLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);

		String[] mn = scanner.nextLine().split(" ");
		int m = Integer.parseInt(mn[0]);
		int n = Integer.parseInt(mn[1]);

		int[] apples = new int[m];

		String[] applesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			int applesItem = Integer.parseInt(applesItems[i]);
			apples[i] = applesItem;
		}

		int[] oranges = new int[n];

		String[] orangesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int orangesItem = Integer.parseInt(orangesItems[i]);
			oranges[i] = orangesItem;
		}

		countApplesAndOranges(s, t, a, b, apples, oranges);

		scanner.close();
	}
}
