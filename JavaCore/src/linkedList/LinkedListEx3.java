package linkedList;
//size,clear,remove
import java.util.LinkedList;

public class LinkedListEx3 {
	public static void main(String[] args) {

		   LinkedList<String> list = new LinkedList<String>();

		   list.add("a");
		   list.add("b");
		   list.add("c");
		   list.add("d");

		   System.out.println("LinkedList:" + list);

		   LinkedList <String> List2 = new LinkedList<String>();
			List2.add("e");
			List2.add("f");
			List2.add("g");
			System.out.println(" LinkedList2 = "+List2);
			
		   list.addAll(2, List2);

		   System.out.println("LinkedList:" + list);
		   list.size();
		   System.out.println("Size of list="+list);
		   list.clear();
		   list.size();
		   System.out.println("Size of list after clear="+list);
		   list.add("h");
		   System.out.println();
		   List2.remove("g");
		   System.out.println("After removing G="+List2);
		   }
}
		
