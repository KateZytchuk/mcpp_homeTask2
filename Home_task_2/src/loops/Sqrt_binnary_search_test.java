package loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sqrt_binnary_search_test 
{
	@Test
	public void testP1()
	{
		int sqr = Sqrt_binnary_search.Sqrt_binnary(100);
		assertEquals(10,sqr);
	}
	
	@Test
	public void testR1()
	{
		int sqr = Sqrt_binnary_search.Sqrt_binnary(15);
		assertEquals(3,sqr);
	}
	
	@Test
	public void test01()
	{
		int sqr = Sqrt_binnary_search.Sqrt_binnary(0);
		assertEquals(0,sqr);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testN1()
	{
		Sqrt_binnary_search.Sqrt_binnary(-100);
	}
	
	@Test
	public void testP2()
	{
		int sqr = Sqrt_binnary_search.Sqrt_binnary(100);
		assertEquals(10,sqr);
	}
	
	@Test
	public void testR2()
	{
		int sqr = Sqrt_binnary_search.Sqrt_binnary(10);
		assertEquals(3,sqr);
	}
	
	@Test
	public void test02()
	{
		int sqr = Sqrt_binnary_search.Sqrt_binnary(0);
		assertEquals(0,sqr);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testN2()
	{
		Sqrt_binnary_search.Sqrt_binnary(-100);
	}
}
