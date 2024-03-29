package conditionals;

import static org.junit.Assert.*;

import org.junit.Test;

public class Even_num_test 
{

	@Test
	public void test_even_all() 
	{
		int a = 4;
		int b = 6;
		int rez = Even_num.frst_task(a, b);
		assertEquals(24, rez);
	}
	@Test
	public void test_noteven_all() 
	{
		int a = 3;
		int b = 5;
		int rez = Even_num.frst_task(a, b);
		assertEquals(8, rez);
	}
	@Test
	public void test_even_first() 
	{
		int a = 4;
		int b = 9;
		int rez = Even_num.frst_task(a, b);
		assertEquals(36, rez);
	}
	@Test
	public void test_even_second() 
	{
		int a = 7;
		int b = 2;
		int rez = Even_num.frst_task(a, b);
		assertEquals(9, rez);
	}
}
