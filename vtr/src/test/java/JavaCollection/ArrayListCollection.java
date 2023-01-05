package JavaCollection;

import java.util.ArrayList;

public class ArrayListCollection {
	
	public static void main(String[] args)
	{
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add('A');
		list.add("hello");
		list.add(null);
		list.add(10);
		list.add(null);
		
		list.add(2,"hi");
		
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add('B');
		list2.add("bye");
		list2.add(10);
		list2.add(null);
		
		//=============================
		//list.retainAll(list2);    // show duplicates in both arraylist
		System.out.println(list);
		//==========================
		list.removeAll(list2);      //delete duplictaes in both arraylist
		System.out.println(list);
		
		//===================================
		if(list.contains('A'))         //it will check the element present in the list
		{
			System.out.println("is present");
		}
		else {
			System.out.println("is not present");
		}
		
		//============================
		list2.remove(1);      //remove the first index
		System.out.println(list2);
		
		
		for(Object obj : list2)        //printing all the elements present in list2 using for-each loop
		{
			System.out.println(obj);
		}
		
		System.out.println(list.get(1));    //get the element from index 3
		
		
		
		
		
		
	}

}
