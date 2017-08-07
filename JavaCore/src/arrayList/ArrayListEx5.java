package arrayList;

//clear
import java.util.ArrayList;

public class ArrayListEx5 {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(0,5);
		System.out.println(" My Array List  = "+al);
		
		ArrayList <Integer> al2 = new ArrayList<Integer>();
		al2.add(6);
		al2.add(7);
		al2.add(8);
		System.out.println(" My Array List2  = "+al2);
		
		al.size();
      System.out.println("Size of al="+al.size());
		al.clear();
		al.size();
		System.out.println("ArrayList5 :"+al);
      System.out.println("Size of al="+al.size());

		
		
	}

}


