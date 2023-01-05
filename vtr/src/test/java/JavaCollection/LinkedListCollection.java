package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListCollection {
	
	public static void main(String[] args)
	{
		
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(10);
		list.add('A');
		list.add("hello");
		list.add(null);
		list.add(10);
		list.add(null);
		
		list.add(2,"hi");
		
		LinkedList<Object> list2 = new LinkedList<Object>();
		list2.add('B');
		list2.add("bye");
		list2.add(10);
		list2.add(null);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list2.getFirst());
		

}
}
