package conditionals;

/*Посчитать выражение (макс(а*б*с, а+б+с))+3*/

public class Expression_max 
{
	public static double forth_task (double a, double b, double c)
	{
		double x,y;
		return ((x=a*b*c)>(y=a+b+c)?x:y)+3;
	}
}
