package conditionals;

import static org.junit.Assert.*;

import org.junit.Test;

public class Expression_max_test 
{
	@Test
	public void test_1() 
	{
		assertEquals(6, Expression_max.forth_task(1, 1, 1), 0.001);
	}
	@Test
	public void test_2() 
	{
		assertEquals(30, Expression_max.forth_task(3, 3, 3),0.001);
	}
	@Test
	public void test_0() 
	{
		assertEquals(3, Expression_max.forth_task(0,0,0),0.001);
	}
}