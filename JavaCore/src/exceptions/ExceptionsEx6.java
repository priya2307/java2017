package exceptions;
//program to print the value of C(a is number & b is zero)

public class ExceptionsEx6 {
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
	       
	       catch(ArrayIndexOutOfBoundsException aie)
	       {
		    System.out.println(aie);
		   }
	       System.out.println("DIVIDED BY ZERO");
	}

}

