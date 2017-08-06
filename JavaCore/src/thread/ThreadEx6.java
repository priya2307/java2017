package thread;
public class ThreadEx6 {

	public static void main(String[] args) {
		
		      ThreadGroup tg = new ThreadGroup ("P");
		      Thread t1 = new Thread (tg, "P1");
		      Thread t2 = new Thread (tg, "P2");
		      Thread t3 = new Thread (tg, "P3");
		      t1.start();
		      System.out.println(" Thread name = "+t1.getName());
		      System.out.println(" Thread Group Name = "+tg.getName());
		      t2.start();
		      t3.start();
		      ThreadGroup tg2 = new ThreadGroup ("C");
		      Thread t11 = new Thread (tg2, "C1");
		      Thread t22 = new Thread (tg2, "C2");
		      Thread t33 = new Thread (tg2, "C3");
		      t11.start();
		      System.out.println(" Thread name = "+t11.getName());
		      t22.start();
		      t33.start();
		      tg.destroy();
		      tg2.destroy();
		      System.out.println(" Thread Group Name = "+tg2.getName());
		     
		   }

	}
