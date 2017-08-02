package exceptions;
//nested try block

public class ExceptionsEx9 {
	public static void main(String[] args) {
		 try
		 {
			 int a=Integer.parseInt(args[0]);
			 try
			 {
				 int num=100/a;
				 System.out.println("Value="+num);
			 }
		     catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
		 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		System.out.println("Nested Try"); 
	}
}
