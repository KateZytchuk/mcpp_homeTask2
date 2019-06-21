package one_dimentional_arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class Arr_even_index_test 
{
	@Test(expected=NullPointerException.class)
	public void test1_null() 
	{
		int[] a=null;
		Arr_even_index.SumEvenInd(a);
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void test2_z() 
	{
		int[] a=new int[0];
		Arr_even_index.SumEvenInd(a);
	}
	@Test
	public void test3_1() 
	{
		int[] a= {1};
		assertEquals(1,Arr_even_index.SumEvenInd(a));
	}
	@Test
	public void test3_2() 
	{
		int[] a= {1,2};
		assertEquals(1,Arr_even_index.SumEvenInd(a));
	}
	@Test
	public void test3_7() 
	{
		int[] a= {1,1,1,1,1,1,1};
		assertEquals(4,Arr_even_index.SumEvenInd(a));
	}	
}
