package one_dimentional_arrays;

public class Arr_count_odd 
{
	public static int count_odd(int[] arr)
	{
		if (arr==null) 
			throw new NullPointerException();
		if (arr.length==0) 
			throw new IndexOutOfBoundsException();
		int count=0, n=arr.length;
		for(int i=0;i<n;i++)
		{
			if (i<0||i>=n)
				throw new IllegalArgumentException(); 
			if (arr[i]%2==0) 
				count++;
		}
		return count;
	}
}
