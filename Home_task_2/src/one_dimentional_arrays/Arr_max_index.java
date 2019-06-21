package one_dimentional_arrays;

public class Arr_max_index 
{
	public static int max_ind(int[] arr)
	{
		if (arr==null) 
			throw new NullPointerException();
		if (arr.length==0) 
			throw new IndexOutOfBoundsException();
		int imax=0,n=arr.length;
		for(int i=0;i<n;i++)
		{
			if (i==0||arr[imax]<arr[i]) 
				imax=i;			
		}
		return imax;
	}
}
