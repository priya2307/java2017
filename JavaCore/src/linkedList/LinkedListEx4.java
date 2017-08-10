package linkedList;
//peek,peek first,peek last,poll
import java.util.LinkedList;

public class LinkedListEx4 {
	public static void main(String args[]){
		LinkedList<String>li= new LinkedList<String>();
	     li.add("Employee1");
	     li.add("Employee2");
	     li.add("Employee3");
	     li.add("Employee4");
	     System.out.println("linkedlist="+li);
	li.peek();

	System.out.println("Linkedlist="+li.peek());
	System.out.println("Linkedlist="+li.peek());
	System.out.println("Linkedlist="+li.peek());
	System.out.println("Linkedlist="+li.peek());

	System.out.println("Linkedlist="+li.peekFirst());
	System.out.println("Linkedlist="+li.peekLast());
	
	System.out.println("Linkedlist="+li.poll());
	System.out.println("Linkedlist="+li.poll());
	System.out.println("Linkedlist="+li.poll());
	System.out.println("Linkedlist="+li.poll());

	System.out.println("Linkedlist="+li.peek());

	System.out.println("Linkedlist="+li.poll());
	System.out.println("Linkedlist="+li.peek());

	System.out.println("Linkedlist="+li.poll());
	System.out.println("Linkedlist="+li.peek());
	
	
	System.out.println("Linkedlist="+li);



	}

}
