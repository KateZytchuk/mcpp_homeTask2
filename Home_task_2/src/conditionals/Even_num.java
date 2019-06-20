package conditionals;


public class Even_num 
{
	public static int frst_task (int a, int b)
	{
		int res = 0;
		res = (a%2 == 0)? a*b : a+b;
		return res;
	}
}