import java.util.Scanner;

public class BreakANumber 
{
  public static void main(String[] args)
  {
	try (Scanner a = new Scanner(System.in))
	{
		int i;
		System.out.println("Enter any integer greater than 9");
		i=a.nextInt();
		while(i>0)
		{
		 System.out.println(i%10);
		 i=(int)i/10;   //casting type
		 
		}
	}
  }
	
}
