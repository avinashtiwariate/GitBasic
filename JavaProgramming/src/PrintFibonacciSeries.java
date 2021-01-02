import java.util.Scanner;

public class PrintFibonacciSeries
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int maxnum=0,n1=0,n2=1,sum=0;
		System.out.println("How many terms you want in Fibonacci series ?");
		maxnum=sc.nextInt();
		System.out.println("Fibonacci series of "+maxnum+" terms is:");
		
		
		for(int i=1; i<=maxnum; ++i)
		{
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}

	}
}