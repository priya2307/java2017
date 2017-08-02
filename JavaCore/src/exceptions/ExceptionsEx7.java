package exceptions;
//program to print the value of C(a is number & b is letter)

public class ExceptionsEx7 {
	public static void main(String[] args) {
		try
	       {
	    	   int a=Integer.parseInt(args[0]);
	    	   int b=Integer.parseInt(args[1]);
	    	   int c=a/b;
	    	   System.out.println("Value of C="+c);
	       }
	       
	       catch(ArithmeticException ae)
	       {
	    	System.out.println(ae);   
	       }
	       
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		System.out.println("DIVIDED BY LETTER");

	}

}


