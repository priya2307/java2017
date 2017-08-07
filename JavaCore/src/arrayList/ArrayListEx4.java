package arrayList;

//add All
import java.util.ArrayList;

public class ArrayListEx4 {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(0,5);
		System.out.println(" My Array List before addAll = "+al);
		
		ArrayList <Integer> al2 = new ArrayList<Integer>();
		al2.add(6);
		al2.add(7);
		al2.add(8);
		System.out.println(" My Array List2 before addAll = "+al2);
		
		al.addAll(al2);
		System.out.println("ArrayList4 after addAll:"+al);
		
	}

}
