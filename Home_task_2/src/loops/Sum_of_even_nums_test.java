package loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sum_of_even_nums_test 
{
	@Test
	public void testTask_6_count() 
	{
		int rez = Sum_of_even_nums.task_6_count();
		assertEquals(49, rez);
	}

	@Test
	public void testTask_6_sum() 
	{
		int rez = Sum_of_even_nums.task_6_sum();
		assertEquals(2450, rez);
	}
}
