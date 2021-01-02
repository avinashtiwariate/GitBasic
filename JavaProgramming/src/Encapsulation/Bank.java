package Encapsulation;

public class Bank
{
  double bal = 180000;
  int withdrawal;

public double getbal()
{
  return bal;
}

public void setwithdrawal(int w)
{
  System.out.println("u have requsted for "+w);
  
  if(w>0 && w<=bal )
  {
	this.withdrawal=w;
  }
  else if(w<0)
  {
    System.out.println("Enter the withdrawal amount above Zero!"); 
  }
  else
  {
	 System.out.println("Low balance...Your balance is "+bal ); 
  }
 
}

}