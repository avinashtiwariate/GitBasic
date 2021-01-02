
public class FibonacciSeries 
{
	public static void main(String[]args)
	{
	 printFS(100);
	}
	public static void printFS(int ur)
	{
		int n1=0,n2=1,sum,var,temp=15;
		 System.out.println(n1);
		 System.out.println(n2);
		 for(var=2; var<=temp; var++)
		 {
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		 }
	}
	
}


