package arrayList;

//sublist
import java.util.ArrayList;

public class ArrayListEx13 {


public static void main(String a[]){
   ArrayList<String> al = new ArrayList<String>();

   al.add("A");
   al.add("B");
   al.add("C");
   al.add("D");
   al.add("E");
   al.add("F");

   System.out.println(" ArrayList= "+al);

   ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
   
   System.out.println("SubList  ArrayList: "+al2);

  
}
}
