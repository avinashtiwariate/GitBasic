package ArrayPrograms;

import java.util.Scanner;

//wap to check whether an object is present in an Array
public class ArrayContains 
{
	public static void main(String[] args)
	{
		int[] ar=new int[5];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;
		
		System.out.println(ar[0]);
		System.out.println(ar);
		
		Scanner sc = new Scanner(System.in);
		int isThisNumPresent = sc.nextInt();
		
		
		
		boolean isPresent=false;
		for (int i= 0; i < ar.length; i++) 
		{
			if (ar[i]==isThisNumPresent) 
			{
				isPresent=true;
				break;
			}
		}
		
		if (isPresent) 
		{
			System.out.println("value is present");
		}
		
		else 
		{
			System.out.println("value is not present");
		}
		
		
		
		int[] br={6,7,8,9,10};
		
		

	}

}
