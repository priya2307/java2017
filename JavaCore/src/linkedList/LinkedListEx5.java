package linkedList;

import java.util.LinkedList;
//pop,push
public class LinkedListEx5 {
	public static void main(String args[]){
		LinkedList<String>li= new LinkedList<String>();
	     li.add("Employee1");
	     li.add("Employee2");
	     li.add("Employee3");
	     li.add("Employee4");
	     System.out.println("linkedlist="+li);
	     
	     System.out.println("LinkedList="+li.pop());
	     System.out.println("LinkedList="+li.pop());
	     System.out.println("LinkedList="+li.pop());
	     System.out.println("LinkedList="+li.pop());

	     System.out.println("linkedlist="+li);
	     
	     li.push("Employee5");
	     System.out.println("linkedlist="+li);
	     
	}
}
