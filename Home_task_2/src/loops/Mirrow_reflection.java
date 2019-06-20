package loops;

public class Mirrow_reflection 
{
	public static int revers(int ch)
	{
		if (ch<0)
			ch= -ch;
		String str = Integer.toString(ch);
		str = new StringBuilder(str).reverse().toString();
		int res = Integer.parseInt(str);
		return res;
	}
}
