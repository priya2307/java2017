package arrayList;

//Iterator
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			Object o = i.next();
			System.out.println(o);
			
		}
		
	}

}




