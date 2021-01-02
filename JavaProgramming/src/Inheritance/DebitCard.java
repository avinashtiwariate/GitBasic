package Inheritance;

public class DebitCard extends Card

{
	void cardDemo() 
	{ 
		super.cardDemo();
		System.out.println("this method exist in Debit card class");
		
	}
	 
	
	public static void main(String[] args) 
	{
		DebitCard dc = new DebitCard();
		System.out.println(dc.cvv);
		System.out.println(dc.expdate);
		
		dc.cardDemo();
		
	}
	
	
}
