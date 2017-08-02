package exceptions;
//printing Exceptional Handling
import java.util.Scanner;

public class ExceptionsEx10 {
	public static void main(String[] args) {
		
		   Scanner input = new Scanner(System.in);
		   
		   try
		       {
			   System.out.println("Enter First Num:");
			   int n1= input.nextInt();
			   System.out.println("Enter Second Num:");
			   int n2= input.nextInt();
			   int Sum=n1+n2;
			   System.out.println(+Sum);
			   }
		  catch(Exception e)
		       {
			  System.out.println(e);
		       }
		   finally
		       {
			   System.out.println("Exception Hnadling");
		       }
		
		}

	}


