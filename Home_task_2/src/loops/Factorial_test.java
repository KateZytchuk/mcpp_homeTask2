package loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Factorial_test 
{
	@Test
	public void testP()
	{
		long f = Factorial.factorial(5);
		assertEquals(120,f);
	}
	
	@Test
	public void test0()
	{
		long f = Factorial.factorial(0);
		assertEquals(1,f);
	}
	
	@Test
	public void test1()
	{
		long f = Factorial.factorial(1);
		assertEquals(1,f);
	}
	
	@Test
	public void test2()
	{
		long f = Factorial.factorial(2);
		assertEquals(2,f);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testN()
	{
		Factorial.factorial(-10);		
	}

}
