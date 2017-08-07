package arrayList;

//iterator
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx9 
{
  public static void main(String args[]) 
    {
     ArrayList<String> al = new ArrayList<String>();
     al.add("B");
     al.add("A");
     al.add("D");
     al.add("C");
     al.add("F");
     al.add("E");

     System.out.print(" My Array List  = "+al);
     Iterator<String> itr = al.iterator();
     
        while(itr.hasNext()) 
        {
        Object O = itr.next();
        System.out.print(O);
        }
     System.out.println();
    }
}

