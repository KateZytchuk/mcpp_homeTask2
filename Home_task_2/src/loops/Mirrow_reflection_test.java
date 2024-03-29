package loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mirrow_reflection_test 
{

	@Test
	public void testP() 
	{
		int res = Mirrow_reflection.revers(89);
		assertEquals(98,res);
	}
	@Test
	public void test_3() 
	{
		int res = Mirrow_reflection.revers(123);
		assertEquals(321,res);
	}
	
	@Test
	public void test_4() 
	{
		int res = Mirrow_reflection.revers(1234);
		assertEquals(4321,res);
	}
	
	@Test
	public void test_5() 
	{
		int res = Mirrow_reflection.revers(12345);
		assertEquals(54321,res);
	}
	
	@Test
	public void testN() 
	{
		int res = Mirrow_reflection.revers(-13);
		assertEquals(31,res);
	}
	
	@Test
	public void test0() 
	{
		int res = Mirrow_reflection.revers(0);
		assertEquals(0,res);
	}
}
