package Inheritance;

class Iphone
{
	int cost;
	int model;
	 void setData(int x,int y)
	 {
		 this.cost=x;
		 this.model=y;
		 
	 }
	 void getData()
	 {
		 System.out.println(" Iphone Cost = "+cost);
		 System.out.println(" Iphone Model= "+model);
	 }
	
}
class Android extends Iphone
{
	String model;
	
	void setSource(String z)
	{
      this.model=z;
	}
	void getSource()
	{
		System.out.println(" Android Model = "+model);
		
	}
}
public class Phone {

	public static void main(String[] args) {
		Android a1 = new Android();
		a1.setData(750,7);
		a1.setSource("Galaxy");
		a1.getData();
		a1.getSource();
		
		
	}
}
