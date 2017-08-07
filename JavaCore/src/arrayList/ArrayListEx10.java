package arrayList;

import java.util.*;

//list iterator
public class ArrayListEx10 
{
     public static void main(String args[]) 
     {
	      ArrayList<String> al = new ArrayList<String>();
	      
	      al.add("B");
	      al.add("A");
	      al.add("C");
	      al.add("D");
	      al.add("F");
	      al.add("E");

	      System.out.print("Original contents of al: ");
	      Iterator itr = al.iterator();
	      
	      while(itr.hasNext()) {
	         Object O = itr.next();
	         System.out.print(O);
	      }
	      
	      ListIterator litr = al.listIterator();
	      
	      while(litr.hasNext()) {
	         Object O = litr.next();
	         litr.set(O);
	      }
	      System.out.print("Modified Contents=");
	      itr = al.iterator();
	      
	      while(itr.hasNext()) {
	          Object O = itr.next();
	          System.out.print(O + " ");
	       }
	       System.out.println();

	       System.out.print("Modified list backwards: ");
	       
	       while(litr.hasPrevious()) {
	          Object O = litr.previous();
	          System.out.print(O + " ");
	       }
	       System.out.println();
	    }
	 }
	      
	     

