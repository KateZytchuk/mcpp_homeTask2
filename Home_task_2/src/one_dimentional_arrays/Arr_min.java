package one_dimentional_arrays;

public class Arr_min 
{
	public static int min_el(int []arr)
	{
		if (arr==null) 
			throw new NullPointerException();
		if (arr.length==0) 
			throw new IndexOutOfBoundsException();
		int min=0,n=arr.length;
		for(int i=0;i<n;i++)
		{
			if (i==0||min>arr[i]) 
				min=arr[i];			
		}
		return min;
	}
}
