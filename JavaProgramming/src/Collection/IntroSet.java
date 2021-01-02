package Collection;

import java.util.HashSet;

public class IntroSet
{
      public static void main(String[] args) 
		{
			/* Set does not allow duplication 
			 * doesnt preserve insertion order
			 * since it does not have index based operation, cant use get() method
			 */
			HashSet hs = new HashSet();
			hs.add(1);
			hs.add(2);
			hs.add(3);
			hs.add(4);
			hs.add(6); //4th index
			hs.add(10);
			hs.add(8);
			hs.add(3);

			IntroSet is = new IntroSet();
			is.CheckDuplicate(hs, 10);

		}

		public void CheckDuplicate(HashSet hs,int i)
		{

			if (hs.add(i)==false) 
			{
				System.out.println("this number is already present");
			}
			else {
				System.out.println("number is not present");
			}
		}
	}
