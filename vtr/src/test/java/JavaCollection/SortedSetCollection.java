package JavaCollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCollection {
	
	public static void main(String args[])
	{
		SortedSet<Object> set = new TreeSet<Object>(); 
		{
			
			set.add("au");
			set.add("bu");
			set.add("cu");
			set.add("du");
			set.add("au");
			
			System.out.println(set);
			
			System.out.println(set.first());
			System.out.println(set.last());
			
		}
	}

}
