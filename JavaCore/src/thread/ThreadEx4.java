package thread;
//Sleep method implementing runnable interface

public class ThreadEx4 implements Runnable {


	public void run() 
	   {
	      for (int i = 1; i < 5; i++) 
	      
	      {
           System.out.println("Thread");
	         try {
	            Thread.sleep(1000);
	             } 
	         catch (Exception e)
	             {
	            System.out.println(e);
	             }
	      }
	   }

	   public static void main(String[] args) throws Exception
	   {
	      Thread t = new Thread(new ThreadEx4());
	      t.start();
	   }
	} 




