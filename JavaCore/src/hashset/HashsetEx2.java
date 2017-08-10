package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx2 {
    public static void main(String ar[]){
  	  HashSet<String>hs=new HashSet<String>();
  	  hs.add("Example1");
  	  hs.add("Example2");
  	  hs.add("Example3");
  	  System.out.println("HashSet="+hs);
  	  
  	  Iterator it = hs.iterator(); 
  	   while (it.hasNext())
  	   {
  	   System.out.println("HashSet ="+it.next());  
  	   }
  	   hs.size();
  	   System.out.println(+hs.size());
  	   boolean x = hs.remove("Example1");
  	   System.out.println("HashSet After Removing 1="+x);
   	  System.out.println("HashSet="+hs);

	 
}
}
