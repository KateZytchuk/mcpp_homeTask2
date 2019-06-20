package loops;


public class Sum_of_even_nums 
{
	public static int task_6_count()
	{
		int count=0;
		for(int i=1; i<=99; i++ )
			if(i%2==0)
			{
				count++;
			}
		return count;
	}
	public static int task_6_sum()
	{
		int  sum=0;
		for(int i=1; i<=99; i++ )
			if(i%2==0)
			{
				sum+=i;
			}
		return sum;
	}
}
