package com.javacodegeeks;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {
	
	@Test
	public void test() {
		int day1, day2;
                GregorianCalendar date = new GregorianCalendar();
                day1 = date.get(Calendar.DAY_OF_MONTH);
		SampleExample example = new SampleExample();
		day2=example.gettheday();
		Assert.assertEquals(day1, day2);
	}
}
