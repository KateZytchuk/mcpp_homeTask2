package loops;

public class Simple_num 
{
	public static String task_7(int ch) 
	{
		String str = "";
		boolean flag = false;
		if (ch == 1 || ch == 0)
			throw new IllegalArgumentException();
		for (int i = 2; i < ch; i++) 
		{
			if (ch % i == 0) 
			{
				flag = true;
				break;
			}
		}
		if (flag)
			str = "Число составное";
		else
			str = "Число простое";
		return str;
	}
}
