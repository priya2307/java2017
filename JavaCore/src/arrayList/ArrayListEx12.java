package arrayList;

//set
import java.util.ArrayList;

public class ArrayListEx12 {

public static void main(String args[]) {
  ArrayList<Integer> al = new ArrayList<Integer>();
  al.add(1);
  al.add(2);
  al.add(3);
  al.add(4);
  al.add(5);
  al.add(6);
  al.add(7);
  System.out.println("ArrayList before update: "+al);

  al.set(0, 11);
  al.set(1, 22);
  
  System.out.println("ArrayList after Update: "+al);
}
}

