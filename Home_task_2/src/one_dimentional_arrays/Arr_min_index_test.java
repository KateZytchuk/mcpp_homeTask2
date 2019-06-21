package one_dimentional_arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class Arr_min_index_test 
{
	@Test(expected=NullPointerException.class)
	public void test1_null() 
	{
		int[] a=null;
		Arr_min_index.min_ind(a);
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void test2_Index() 
	{
		int[] a=new int[0];
		Arr_min_index.min_ind(a);
	}
	@Test
	public void test3_1() 
	{
		int[] a= {1};
		assertEquals(0, Arr_min_index.min_ind(a));		
	}
	@Test
	public void test3_2() 
	{
		int[] a= {1,1};
		int[] b= {2,1};
		int[] c= {2,2};
		assertEquals(0, Arr_min_index.min_ind(a));
		assertEquals(1, Arr_min_index.min_ind(b));
		assertEquals(0,Arr_min_index.min_ind(c));
	}

	@Test
	public void test3_many() 
	{
		int[] a= {1,2,3,4,5,6};
		
		assertEquals(0, Arr_min_index.min_ind(a));
		
	}
}
