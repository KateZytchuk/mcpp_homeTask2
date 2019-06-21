package one_dimentional_arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class Arr_reverse_test 
{

	@Test
	public void test1_even()
	{
		int[] x= {6,5,4,3,2,1};
		int[] vect= {1,2,3,4,5,6};
		Arr_reverse.revers(vect);
		assertArrayEquals(x, vect);
	}
	@Test
	public void test1_odd()
	{
		int[] x= {5,4,3,2,1};
		int[] vect= {1,2,3,4,5};
		Arr_reverse.revers(vect);
		assertArrayEquals(x, vect);
	}
	@Test(expected=NullPointerException.class)
	public void test1_null() 
	{
		int[] a=null;
		Arr_reverse.revers(a);
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void test2_Index() 
	{
		int[] a=new int[0];
		Arr_reverse.revers(a);
	}
	@Test
	public void test3_1() 
	{
		int[] a= {1};
		int[] b= {1};
		Arr_reverse.revers(a);
		assertArrayEquals(b, a);		
	}
	@Test
	public void test3_2() 
	{
		
		int[] b= {2,1};
		int[] c= {1,2};
		Arr_reverse.revers(b);
		assertArrayEquals(c, b);
	}

}
