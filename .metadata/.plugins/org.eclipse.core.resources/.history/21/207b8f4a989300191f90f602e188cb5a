package conditionals;

/*Написать программу определения оценки студента по его рейтингу,
 * на основе следующих правил
 * 0-19 -> 	F
 * 20-39 -> E
 * 40-59 -> D
 * 60-74 -> C
 * 75-89 -> B
 * 90-10 -> A*/

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
