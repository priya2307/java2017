package loop;

import java.util.Scanner;

//to print name using scanner
public class ScannerEx3 
    {
     public static void main(String[] args) 
	 {
        String UserID;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter UserID:");
        UserID = sc.next();
        System.out.println( "UserID:" +UserID);
     }
	}
