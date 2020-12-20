package hu.mitro;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

	@Test
	public void testConversion12AM() {
		String input = "12:00:00AM";
		Assert.assertEquals("00:00:00", Solution.timeConversion(input));
	}

	@Test
	public void testConversion12PM() {
		String input = "12:00:00PM";
		Assert.assertEquals("12:00:00", Solution.timeConversion(input));
	}

	@Test
	public void testConversionPM() {
		String input = "07:05:45PM";
		Assert.assertEquals("19:05:45", Solution.timeConversion(input));
	}
}
