package arrayList;

//clone
import java.util.ArrayList;

public class ArrayListEx6 
     {
      public static void main(String[] args) 
       {
		ArrayList <String> al = new ArrayList<String>();
		al.add("APPLE");
		al.add("ORANGE");
		al.add("MANGO");
		al.add("GRAPES");
	    System.out.println(" My Array List  = "+al);
	    
	    ArrayList<String> al2 = (ArrayList<String>)al.clone();
	    System.out.println("My Array List= "+ al2);

	     al.add("Fig");
	     al.remove("Orange");

	     System.out.println("Original ArrayList:"+al);
	     System.out.println("Cloned ArrayList:"+al2);
	   }
	}
		


