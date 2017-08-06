package thread;
// Sleep method extending from thread class

public class ThreadEx3 {

		public static void main(String[] args) {
			
				
				for( int i=1;i<=5;i++)
				{
					System.out.println(i);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				System.out.println(" no of threads running = "+Thread.activeCount());
		}

	}


