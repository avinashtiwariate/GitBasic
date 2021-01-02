import java.util.Scanner;

public class PrintUserDefinedSeries
{
  public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  double a;
      System.out.println("Enter any positive integer");
	  a=sc.nextDouble();
	  
	  System.out.println("Printing series of "+a);
	  for(double i=0; i<=a; i++)
	   {
	     System.out.println(i);
	   }
	}
}
