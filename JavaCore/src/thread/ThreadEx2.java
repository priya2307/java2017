package thread;
//count Method in thread class

public class ThreadEx2 {
		public static void main(String[] args) {
			Thread t = new Thread();
			 MyChild2 mc2=new MyChild2();
			 t.start();
			 System.out.println(" I am a Parent Thread");
			 mc2.start();
			 int count = Thread.activeCount();
		     System.out.println("currently active threads = " + count);//count will be 2 because child class is also started 
		}
	}
	class MyChild2 extends Thread
	{
	   public void run()
	     {
		         System.out.println(" I am a child Thread");
	     }

	}

