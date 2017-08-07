package arrayList;

//ArrayList using for each (string)
import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add(0, "E");
		System.out.println(" My Array List  = "+al);
		
		ArrayList <String> al2 = new ArrayList<String>();
		al2.add("F");
		al2.add("G");
		al2.add("H");
		System.out.println(" My Array List2  = "+al2);
		
		for( String x : al2) 
		{
			System.out.println(" List Item = "+x);
			
		}
		System.out.println(" Size of Second ArrayList  = "+al2.size());
		System.out.println(" Size of First ArrayList  = "+al.size());
		
		al.remove(4);
		al.remove("Mahesh");
		System.out.println(" After Removing the  Size of First ArrayList  = "+al.size());
		System.out.println(" After Removing First ArrayList  = "+al);
		al.removeAll(al);
		System.out.println(" After Removing First ArrayList  = "+al);

	}

}



