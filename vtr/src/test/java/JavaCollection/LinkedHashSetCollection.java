package JavaCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCollection {
	
	public static void main() {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add(10);
		set.add("hi");
		set.add("hello");
		set.add(null);
		set.add(10);
		set.add(null);
		
		System.out.println(set);
		
		
		Iterator<Object> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

}
}
