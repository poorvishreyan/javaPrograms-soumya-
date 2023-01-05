package JavaCollection;

import java.util.HashSet;

public class D {
	
	public static void main(String[] args)
	{
		String s = "For every request for request";
		String[] str = s.split(s);
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0;i<s.length();i++) {
		
		set.add(str[i]);
	}

		for(String word:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(word.equals(str[i])) {
					count++;
					
				}
			}
		}
}
}
