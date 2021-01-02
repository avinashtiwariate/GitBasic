package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arraylist 
{
  public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(3);
		al.add(9);

		System.out.println("current element of al "+al);
		
		boolean bl = al.remove("aaa");
		if (bl==false) 
		{ 
			System.out.println("object 'aaa' is not removed"); 
		}
		
		
		System.out.println("removing 4th index(value=9) from al "+al.remove(4));	
		//we have to pass index 
		System.out.println("current value of al"+al);

		HashSet<Integer> hs= new HashSet<Integer>();
		System.out.println("copying al elements to hs ");
		hs.addAll(al);
		System.out.println("element present in hs "+hs);
		System.out.println("checking if hs contains value 9");
		
		boolean hs1 = hs.contains(9);
		if(hs1==false)
		{
			System.out.println("object is not present");
		}
		
		System.out.println("are all element of latest al is present in hs "+hs.containsAll(al));
		
}

}
