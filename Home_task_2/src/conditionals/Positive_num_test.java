package conditionals;

import static org.junit.Assert.*;

import org.junit.Test;

public class Positive_num_test 
{

	@Test
	public void test_0() 
	{
		assertEquals(0, Positive_num.third_task(0, 0, 0));
	}
	@Test
	public void test_1_1() 
	{
		assertEquals(1, Positive_num.third_task(1, 0, 0));
	}
	@Test
	public void test_1_2() 
	{
		assertEquals(1, Positive_num.third_task(-1, 1, 0));
	}
	@Test
	public void testP_1_3() 
	{
		assertEquals(1, Positive_num.third_task(-1, -1, 1));	
	}
	@Test
	public void test_2_1() 
	{
		assertEquals(2, Positive_num.third_task(1, 1, 0));
	}
	@Test
	public void test_2_2() 
	{
		assertEquals(2,Positive_num.third_task(-1, 1, 1));
	}
	@Test
	public void test_2_3() 
	{
		assertEquals(2,Positive_num.third_task(1, -1, 1));
	}
}
