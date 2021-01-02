
public class CheckPrime 
{
  public static void main(String[] args)
  {
    Prime();
  }
  public static void Prime()
  {
		int i, a=0;
		boolean c=true;
		int p=13;
		a=p/2;
		if(p==0 || p==1)
		{
		 System.out.println(p+" is not a prime number");
		}
		
		else
		{
		 for(i=2; i<=a; i++)
		 {
		  if(p%i==0)
		  {
			  System.out.println(p+" is not a prime number");
			  c=false;
			  break;
		  }
		 }
		 if(c==true)
		 {
			System.out.println(p+" is a prime number"); 
		 }
		}  
  }
}

