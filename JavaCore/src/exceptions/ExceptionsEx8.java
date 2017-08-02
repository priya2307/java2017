package exceptions;
//To print exception & finally keyword

public class ExceptionsEx8 {

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
		       catch(NumberFormatException nfe)
				{
					System.out.println(nfe);
				}
		       catch(Exception e)
			   {
				   System.out.println(e);
			   }
		       finally
		       {
		    	   System.out.println("This has to be print at any Cause");
		       }
		       System.out.println("FINALLY");
	}

	}
	

