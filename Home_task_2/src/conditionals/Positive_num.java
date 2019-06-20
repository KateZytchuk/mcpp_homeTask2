package conditionals;

public class Positive_num 
{	
	public static int third_task(int a, int b, int c)
	{
		int res = 0;
		if(a>0)
			res+=a;
		if (b>0)
			res+=b;
		if(c>0)
			res+=c;
		return res;
	}
	/*Альтернативный вариант: 
	 * return (a>0?a:0)+(b>0?b:0)+(c>0?c:0);*/
}
