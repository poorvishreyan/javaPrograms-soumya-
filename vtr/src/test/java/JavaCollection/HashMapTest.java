package JavaCollection;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args)
	{
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(10, "Hi");
		map.put(100, 10);
		map.put(108, "dell");
		map.put(106, "dell");        //duplicate values are allowed
		map.put(108, "lenovo");    //duplicate keys are not allowed
		map.put(110, null);     //allowed
		map.put(null,"abc");  //not allowed
		
		System.out.println(map);
		
		System.out.println("before removing" +map);
		map.remove(100);
		
		System.out.println("after removing" +map);
		System.out.println(map.containsKey(106));    //true
		System.out.println(map.get(108));
		map.replace(106, "dell", "HP"); //replace old value with new value
		System.out.println(map);
		
		
	}

}
