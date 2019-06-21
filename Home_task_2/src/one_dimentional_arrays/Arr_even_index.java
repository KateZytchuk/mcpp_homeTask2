package one_dimentional_arrays;

public class Arr_even_index 
{
	public static int SumEvenInd(int[] a)
	{
		if(a==null) 
			throw new NullPointerException();
		if(a.length==0) 
			throw new IndexOutOfBoundsException();
		int rez=0;
		for(int i=0; i<a.length;i+=2)
			rez+=a[i];
		return rez;
	}
}
