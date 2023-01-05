package JavaCollection;

import java.util.TreeMap;

public class TreeMapTest {
	
	public static void main(String[] args)
	{
		TreeMap<Integer, Object> map = new TreeMap<Integer, Object>();
		map.put(10, "hi");
		map.put(100, 200);
		map.put(101, "bye");
		map.put(102, "bye");
		map.put(103, null);
		//map.put(null, "xyz");        //should not have null keys 
		//map.put(null, "abc");        
		map.put(107, null);       
		
		System.out.println(map);
		
		System.out.println("before removing"  +map);
		System.out.println(map.remove(100));
		
		System.out.println("after removing" +map);
		
		System.out.println(map.containsKey(101));
		
		System.out.println(map.containsValue("bye"));
		
		
		
		
	}

}
