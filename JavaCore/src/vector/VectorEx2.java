package vector;

import java.util.Vector;
//is empty,hash code, capacity
public class VectorEx2 {

	public static void main(String[] args) {
		Vector<Integer>v= new Vector<Integer>(5);
        System.out.println("Vector= "+v.isEmpty()); 

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        System.out.println("Vector= "+v.isEmpty()); 
       System.out.println("Vector="+v); 
       System.out.println("Vector="+v.capacity());
       System.out.println("Vector="+v.hashCode());                  
       System.out.println("Vector= "+v.isEmpty()); 

       Vector<String> v2 = (Vector<String>)v.clone();
	       System.out.println("Vector="+v2);
	}
}
