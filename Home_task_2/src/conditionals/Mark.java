package conditionals;


public class Mark 
{
	public static char fifth_task(int a)
	{
		char res = '0';
		if(a < 0 || a > 100)
			throw new  IllegalArgumentException();
		if(a >= 0 && a<20)
			res = 'F';
		else if (a < 40)
			res = 'E';
		else if (a < 60)
			res = 'D';
		else if (a < 75)
			res = 'C';
		else if (a < 90)
			res = 'B';
		else if (a <= 100)
			res = 'A';
		return res;
	}
}
