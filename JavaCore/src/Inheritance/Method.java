package Inheritance;
//program to print final

class RoyalEnfiled
{
	final void limit()
	{
		System.out.println(" Its cost is 2000$ ");
	}
	void maxSpeed()
	{
		System.out.println(" Speed Limit is 100");
	}
}
class Classic extends RoyalEnfiled 
{
	
	void maxSpeed()
	{
		System.out.println(" Speed limit is 120");
	}
	
}

public class Method {

	public static void main(String[] args) {
	Classic a = new Classic();
	a.maxSpeed();
	a.limit();

	}

  }