package hu.mitro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class ResultTest {

	private List<Integer> input1;
	private List<Integer> input2;

	@BeforeEach
	void setUp() {
		input1 = Arrays.asList(3, 1, 2, 3);
		input2 = Arrays.asList(3, 1, 2, 3, 3);
	}

	@Test
	void birthdayCakeCandles_input1() {
		int result = Result.birthdayCakeCandles(input1);
		Assertions.assertEquals(2, result);
	}

	@Test
	void birthdayCakeCandles_input2() {
		int result = Result.birthdayCakeCandles(input2);
		Assertions.assertEquals(3, result);
	}

	@Test
	public void testBirthdayCakeCandles2() {
		int result = Result.birthdayCakeCandles2(input1);
		Assertions.assertEquals(2, result);
	}

	@Test
	public void testBirthdayCakeCandles3() {
		int result = Result.birthdayCakeCandles3(input1);
		Assertions.assertEquals(2, result);
	}
}
