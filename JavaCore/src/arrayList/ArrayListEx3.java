package arrayList;

//ArrayList using for each (integer)
import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(0,5);
		System.out.println(" My Array List  = "+al);
		
		ArrayList <String> al2 = new ArrayList<String>();
		al2.add("F");
		al2.add(0,"G");
		al2.add("H");
		System.out.println(" My Array List2  = "+al2);
		
	}

}
