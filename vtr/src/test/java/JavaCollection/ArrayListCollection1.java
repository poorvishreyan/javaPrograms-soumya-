package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection1 {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(50);
		list.add(3);
		list.add(4);
		
		
		
		
		
		
		
		Collections.sort(list);;
		for(Integer inte : list)
		{
			System.out.println(inte);
		}
		
	}
}
