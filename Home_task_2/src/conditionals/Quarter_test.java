package conditionals;

import static org.junit.Assert.*;

import org.junit.Test;

public class Quarter_test 
{
	@Test
	public void test_midle_1()
	{
		assertEquals(1,Quarter.scnd_task(2, 4));
	}
	
	@Test
	public void test_midle_large_numbers_1()
	{
		assertEquals(1,Quarter.scnd_task(Integer.MAX_VALUE,Integer.MAX_VALUE));
	}
	
	@Test
	public void test_midle_2()
	{
		assertEquals(2,Quarter.scnd_task(-1,5));
	}
	
	@Test
	public void test_midle_large_numbers_2()
	{
		assertEquals(2,Quarter.scnd_task(Integer.MIN_VALUE,Integer.MAX_VALUE));
	}
	
	@Test
	public void test_midle_3()
	{
		assertEquals(3,Quarter.scnd_task(-4,-6));
	}
	@Test
	public void test_midle_large_numbers_3()
	{
		assertEquals(3,Quarter.scnd_task(Integer.MIN_VALUE,Integer.MIN_VALUE));
	}
	@Test
	public void test_midle_4()
	{
		assertEquals(4,Quarter.scnd_task(3,-2));
	}
	@Test
	public void test_midle_large_numbers_4()
	{
		assertEquals(4,Quarter.scnd_task(Integer.MAX_VALUE,Integer.MIN_VALUE));
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_axis_x()
	{
		Quarter.scnd_task(0,44);
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_axis_y()
	{
		Quarter.scnd_task(44,0);
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_center_coord()
	{
		Quarter.scnd_task(0,0);
	}

}
