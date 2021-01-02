package LeapYear;

//WAP to check for a leap year

public class LeapYear
{
	public static boolean CheckYear(int year)
	{
		if (year % 400 == 0)
	    return true;

		if (year % 100 == 0)
	    return false;

		if (year % 4 == 0)
	    return true;
		return false;
	}


	public static void main(String[] args) 
	{
		System.out.println( CheckYear(2000)? "Leap Year":"Not a Leap Year" );
	}
}
