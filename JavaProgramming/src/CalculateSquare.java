import java.util.Scanner;

public class CalculateSquare 
{ 
  public static void main(String[] agrs)
  { Scanner sc=new Scanner(System.in);
    double a;
    System.out.println("Enter an integer");
    a=sc.nextDouble();
    System.out.println("Square of "+a+" is: "+Math.pow(a, 2));
  }

}
