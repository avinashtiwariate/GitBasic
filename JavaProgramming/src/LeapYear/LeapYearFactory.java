package LeapYear;

import java.time.Year;

public class LeapYearFactory 
{
	public static void main(String[] args) 
	{
		Year yr=Year.of(2001);
		System.out.println(yr.isLeap());
		
		
	}
}
