package enumeration;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx1 {

	public static void main(String[] args) {
	      Vector v = new Vector();
	      
	      v.add("p");
	      v.add("r");
	      v.add("i");
	      v.add("y");
	      v.add("a");
         System.out.println("vector="+v);	    
         
         Enumeration x= Collections.enumeration(v);
	      while (x.hasMoreElements()) {
	         System.out.println(x.nextElement()); 
	      }
	   }
	}
