import java.util.Scanner;

public class PrintPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int lr,hr;

		System.out.println("Enter two values to print its Prime number range");
		lr=sc.nextInt();
		hr=sc.nextInt();
		if(lr>hr)
		{
			int x=lr;
			lr=hr;
			hr=x;
		}
		for(int i=lr; i<=hr; i++)
		{ 
			boolean isPrime=true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}

			if(isPrime==true)
			{
				System.out.println(i);
			}
		}
	}
}




