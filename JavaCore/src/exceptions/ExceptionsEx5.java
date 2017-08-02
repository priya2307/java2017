package exceptions;
//program to print the value of C(a & b are numbers)

public class ExceptionsEx5 {
	public static void main(String[] args) {
	       try
	       {
	    	   int a=Integer.parseInt(args[0]);
	    	   int b=Integer.parseInt(args[1]);
	    	   int c=a/b;// a=100;b=50
	    	   System.out.println("Value of C="+c);
	       }
	       
	       catch(ArithmeticException ae)
	       {
	    	System.out.println(ae);   
	       }
	       
	       System.out.println("ONLY NUMBERS");

}

}

