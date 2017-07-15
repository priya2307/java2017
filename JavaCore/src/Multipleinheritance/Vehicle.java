package Multipleinheritance;


class Car
{
	int speed;
	    
	   void setDetails(int x)
	{
     this.speed=x;
	}
	 void getDetails()
	{
		System.out.println("Speed="+speed);
	}
}

class Bus extends Car
{
    int distance;
    
       void setData(int d)
       {
    	   this.distance=d;
       }
       void getData()
       {
    	   System.out.println("Distance="+distance);
       }
}
 class Auto extends Bus
  {
     int time;
     
         void setOutput()
         {
	       time=distance/speed;
         }
         void getOutput()
         {
        	 System.out.println("Time travelled="+time);
         }
  }
public class Vehicle
{
	public static void main(String ar[]){
		Auto a1 = new Auto();
		a1.setDetails(10);
		a1.setData(50);
		a1.setOutput();
		a1.getDetails();
		a1.getData();
		a1.getOutput();

	}
}
	