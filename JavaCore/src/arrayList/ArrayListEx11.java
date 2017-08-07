package arrayList;

//remove and size method
import java.util.ArrayList;

public class ArrayListEx11 {

public static void main(String[] args) {
   
ArrayList<Integer> al = new ArrayList<Integer>(5);

al.add(20);
al.add(15);
al.add(30);
al.add(45);
System.out.print(" My Array List  = "+al);
System.out.println("Size of list: " + al.size());
	
for (Integer x : al) {
System.out.println("Number = " + x);
}  
	
al.remove(0);
System.out.print(" My Array List  = "+al);
System.out.println("Now, Size of list: " + al.size());
	
}
}
