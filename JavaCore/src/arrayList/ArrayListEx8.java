package arrayList;

//get method
import java.util.ArrayList;

public class ArrayListEx8 {


 public static void main(String[] args) {
    
 ArrayList<Integer> al = new ArrayList<Integer>(5);

 al.add(1);
 al.add(2);
 al.add(3);
 al.add(4);

 for (Integer x : al) {
 System.out.println("Number = " + x);
 } 
	
 int y=al.get(3);
 System.out.println("Retrieved element is = " + y);	   
 }
}   
