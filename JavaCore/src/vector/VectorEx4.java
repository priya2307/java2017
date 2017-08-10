package vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx4 
{

	public static void main(String[] args)
	{
		Vector<Integer>v= new Vector<Integer>();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);
        System.out.println("Vector= "+v); 
        
        Iterator<Integer>it=v.iterator();
        while(it.hasNext())
        {
        	Object o=it.next();
        	System.out.println("Number="+o);
        }
        ListIterator<Integer>lit=v.listIterator();
        while(lit.hasNext())
        {
        	Object o=lit.next();
        	System.out.println("Number="+o);
        }
        System.out.println("Vector="+v.remove(1));
        }

	}


