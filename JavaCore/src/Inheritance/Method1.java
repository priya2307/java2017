package Inheritance;
//program to print super
class Swift
{
	void limit()
	{
		System.out.println(" Its cost is 2000$ ");
	}
	void maxSpeed()
	{
		System.out.println(" Speed Limit is 100");
	}
}
class SwiftDzire extends Swift
{
	
	void limit()
	{
		System.out.println(" Its cost is 3000$ ");
	}

	void maxSpeed()
	{
		System.out.println(" Speed limit is 120");
	}
	void child()
	 	{
	 	super.limit();	
	 	}
}

public class Method1 {

	public static void main(String[] args) {
	SwiftDzire a = new SwiftDzire();
	a.child();

	}

  }
