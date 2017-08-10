package linkedList;
//remove
import java.util.LinkedList;

public class LinkedListEx6 {
	public static void main(String args[]){
		LinkedList<String>li= new LinkedList<String>();
	     li.add("Employee1");
	     li.add("Employee2");
	     li.add("Employee3");
	     li.add("Employee4");
	     System.out.println("linkedlist="+li);
	     System.out.println("LinkedList="+li.remove(3));
	}
}
