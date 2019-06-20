package loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sum_of_digits_test 
{
	@Test
	public void testSumP()
	{
		int sum = Sum_of_digits.sum(123);
		assertEquals(6,sum);
	}

	@Test
	public void testSumN()
	{
		int sum = Sum_of_digits.sum(-2530);
		assertEquals(10,sum);
	}
	
	@Test
	public void testSum0()
	{
		int sum = Sum_of_digits.sum(0);
		assertEquals(0,sum);
	}
	@Test
	public void testSum1()
	{
		int sum = Sum_of_digits.sum(1);
		assertEquals(1,sum);
	}
	@Test
	public void testSum2()
	{
		int sum = Sum_of_digits.sum(2);
		assertEquals(2,sum);
	}
}
