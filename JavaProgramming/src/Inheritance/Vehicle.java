package Inheritance;

class Vehicle 
{ 
  int maxspeed=100;
  Vehicle()
  {
	System.out.println("vehicle constructor");
    for(int i=2; i<10; i++)
    {
	 System.out.println("Vroom Vroom"); 
    }
  
   }
  
}

class Car extends Vehicle
{
  int maxspeed=120;
  Car()
  {	
	System.out.println(super.maxspeed);
	System.out.println();
  }

}


