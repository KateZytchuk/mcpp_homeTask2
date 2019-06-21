package one_dimentional_arrays;

public class Arr_reverse 
{
	public static void revers(int[] arr)
	{
		if (arr==null) 
			throw new NullPointerException();
		if (arr.length==0) 
			throw new IndexOutOfBoundsException();
		int n=arr.length;
		for(int i=0; i<n/2;i++)
		{
			int a=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=a;
		}
		return ;
	}
}
