package loops;

public class Factorial 
{
	public static long factorial(double ch)
	{
		if (ch < 0)
			throw new IllegalArgumentException();
		else
		{
			long res = 1;
		
			if (ch == 0)
				{
					res = 1;
				}
			else
			{			
				for (int i = 1; i <=ch; i++)
				{
					res = res*i;
				}
			
			}
			return res;
		}
		
	}
}
