package one_dimentional_arrays;

public class Arr_max 
{
	public static int max_el(int[] arr)
	{
		if (arr==null) 
			throw new NullPointerException();
		if (arr.length==0) 
			throw new IndexOutOfBoundsException();
		int max=0,n=arr.length;
		for(int i=0;i<n;i++)
		{
			if (i==0||max<arr[i]) 
				max=arr[i];			
		}
		return max;
	}
}
