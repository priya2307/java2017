package Oops;

public class Gmail {

	String Userid;
	String Password;
	
	
	public void Enter(String x, String y)
	{
		this.Userid=x;
		this.Password=y;
	}
	
	public void display()
	{
		System.out.println("User Account ID = "+this.Userid);
		System.out.println("User Account Password= "+this.Password);
	}
}
