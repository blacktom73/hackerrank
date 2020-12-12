package hu.mitro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class ResultTest {

	private List<Integer> input;

	@BeforeEach
	void setUp() {
		input = Arrays.asList(3, 1, 2, 3);
	}

	@Test
	void birthdayCakeCandles() {
		int result = Result.birthdayCakeCandles(input);
		Assertions.assertEquals(2, result);
	}

	@Test
	public void testBirthdayCakeCandles2() {
		int result = Result.birthdayCakeCandles2(input);
		Assertions.assertEquals(2, result);
	}

	@Test
	public void testBirthdayCakeCandles3() {
		int result = Result.birthdayCakeCandles3(input);
		Assertions.assertEquals(2, result);
	}
}
