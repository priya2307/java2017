package thread;
//Using Active count Method in thread class

public class ThreadEx1 {

		public static void main(String[] args) 
		{
			
			 Thread t = new Thread();
			 MyChild1 mc=new MyChild1();
			 t.start();
			 System.out.println("I am a Parent Thread");
			 int count = Thread.activeCount();
		     System.out.println("currently active threads = " + count);//count will be 1 because child class is not yet started 
			 mc.start();
	    }
	 }
	     class MyChild1 extends Thread
	       {
		      public void run()
		        {
			         System.out.println(" I am a child Thread");
		        }

	       }

