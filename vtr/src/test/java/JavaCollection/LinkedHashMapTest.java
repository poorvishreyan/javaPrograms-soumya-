package JavaCollection;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
		
		map.put(10, "hi");
		map.put(100, 200);
		map.put(101, "bye");
		map.put(102, "bye");
		map.put(103, null);
		map.put(null, "xyz");     //allowed
		map.put(null, "abc");     //not allowed
		map.put(107, null);       //allowed
		
		System.out.println(map);
		
		System.out.println("before removing" +map);
		map.remove(100);      
		System.out.println("after removing" +map);
		
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue(null));
		
		System.out.println(map.get(102));
		
		map.replace(101, "bye", "goodBye");     //replace the old value with new value
		System.out.println(map);
		
		
		System.out.println(map);

	}

}
