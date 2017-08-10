package hashset;

import java.util.HashSet;

public class HashsetEx1
{
      public static void main(String ar[])
      {
    	  HashSet<String>hs=new HashSet<String>();
    	  System.out.println("HashSet is empty");
    	  hs.add("Example1");
    	  hs.add("Example2");
    	  hs.add("Example3");
    	  System.out.println("HashSet="+hs);
    	  boolean x=hs.isEmpty();
    	  System.out.println("HashSet is Empty");
    	  boolean y=hs.contains("Example1");
    	  if (y==true)
    	  {
    		  System.out.println("Contains Example1");
    	  }
    	  else
    	  {
    		  System.out.println("Doesn't Contain any Example1");
    	  }
    	  
    	  HashSet<String>hs1=(HashSet<String>)hs.clone();
    	  System.out.println(hs1);
    	  hs.clear();
    	  System.out.println("HashSet="+hs);
    	  
    	  
      }
}




