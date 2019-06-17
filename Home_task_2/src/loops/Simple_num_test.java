package loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Simple_num_test 
{
	@Test(expected = IllegalArgumentException.class)
	public void testMy_chisl_0() 
	{
		Simple_num.task_7(0);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMy_chisl_1() 
	{
		Simple_num.task_7(1);
	}
	@Test
	public void testMy_chisl_not_ok() 
	{
		String str = Simple_num.task_7(25);
		assertEquals("����� ���������", str);
	}
	@Test
	public void testMy_chisl_ok() 
	{
		String str = Simple_num.task_7(5);
		assertEquals("����� �������", str);
	}
}
