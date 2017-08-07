package arrayList;

//contains method
import java.util.ArrayList;

 public class ArrayListEx7 {
 public static void main(String[] args) {
    
 ArrayList<Integer> al = new ArrayList<Integer>(8);//contains 8 element

 al.add(20);
 al.add(25);
 al.add(10);
 al.add(15);        
     
 for (Integer x : al)// printing all the elements 
 {
 System.out.println("Number = " + x);
 }

 boolean y = al.contains(10); // list contains element 10(y is a variable)
	  
 if (y == true) 
 {
 System.out.println("element 10 is contained in the list");
 }
 else
 {
 System.out.println("element 10 is not contained in the list");
 }
		
 }
}



