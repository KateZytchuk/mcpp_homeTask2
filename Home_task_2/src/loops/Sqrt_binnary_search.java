package loops;

public class Sqrt_binnary_search 
{
	public static int Sqrt_binnary(double ch)
	{
		 if(ch<0)
	    	 throw new IllegalArgumentException();
		int left = 1, right = (int)ch / 2;
		int temp = (left+right)/2;
		while(right-left>1)
		{
			if (temp*temp>ch)
				right=temp;
			else if (temp*temp<ch) 
				left=temp;
			else  
				break;
			temp=(right+left) /2;
		}
		return temp;
	}
}
