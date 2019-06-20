package loops;

public class Sum_of_digits 
{
	public static int sum(int ch)
	{
		int sum=0;
		if (ch<0)
			ch=-ch;
		while(ch != 0)
		{
			sum+=ch %10;
			ch/=10;
		}
		return sum;
	}
}
