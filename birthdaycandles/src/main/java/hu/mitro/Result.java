package hu.mitro;

import java.util.List;
import java.util.Optional;


public class Result {
	/*
	 * Complete the 'birthdayCakeCandles' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts INTEGER_ARRAY candles as parameter.
	 */

	public static int birthdayCakeCandles(List<Integer> candles) {
		Optional<Integer> max = candles.stream().max(Integer::compareTo);
		return Math.toIntExact(candles.stream().filter(elem -> elem.equals(max.get())).count());
	}

	public static int birthdayCakeCandles2(List<Integer> candles) {
		int maxValue = findMaxValue(candles);
		return countMaxValues(candles, maxValue);
	}

	public static int birthdayCakeCandles3(List<Integer> candles) {
		candles.sort(Integer::compareTo);
		Integer maxValue = candles.get(candles.size() - 1);
		return (int) candles.stream().filter(integer -> integer.equals(maxValue)).count();
	}

	private static int findMaxValue(List<Integer> candles) {
		int maxTemp = Integer.MIN_VALUE;
		for (Integer elem : candles) {
			if (elem > maxTemp) {
				maxTemp = elem;
			}
		}
		return maxTemp;
	}

	private static int countMaxValues(List<Integer> candles, int maxValue) {
		int maxCount = 0;
		for (Integer elem : candles) {
			if (elem.equals(maxValue)) {
				maxCount++;
			}
		}
		return maxCount;
	}

}
