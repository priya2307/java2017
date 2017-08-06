package thread;
//join method extending from thread class
public class ThreadEx5 {

	public static void main(String[] args) 
	{
		MyChild3 mc3 = new MyChild3();
		MyChild4 mc4 = new MyChild4();
		MyChild5 mc5 = new MyChild5();
		mc3.start();
		try 
		     {
			mc3.join();
		     } 
		catch (InterruptedException e) 
		     {
			e.printStackTrace();
		     }
		
		mc4.start();
		mc5.start();

	}

}
class MyChild3 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			
			System.out.println(" i = "+i);
		     
	    }
  }
}
class MyChild4 extends Thread
{

	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println(" j = "+j);
		}
	}
	
}
class MyChild5 extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
		{
			System.out.println(" k = "+k);
		}
	}
	
}




