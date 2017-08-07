package linkedList;

import java.util.LinkedList;

//add


public class LinkedListEx1 {

public static void main(String[] args) {

 LinkedList list = new LinkedList();

 list.add("A");
 list.add(1);
 list.add("C");
 list.add(2);

 System.out.println("LinkedList:" + list);

 list.add(2,"B");

 System.out.println("After add LinkedList:" + list);
 }
}



