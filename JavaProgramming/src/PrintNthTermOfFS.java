//wap to print n'th to o'th term of fibonacci series


public class PrintNthTermOfFS
{

	public static void main(String[] args)
	{


		int maxnum=0,n1=0,n2=1,sum=0;

		int m=5;
		int n=15;

		for(int i=1; i<=n; ++i)
		{	
			int count=0;
			if (count>=m)
			System.out.println(n1);
			
			sum=n1+n2;
			n1=n2;
			n2=sum;
			count++;
		}

	}

}
