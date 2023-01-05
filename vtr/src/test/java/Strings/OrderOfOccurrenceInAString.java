package Strings;

import java.util.LinkedHashSet;

public class OrderOfOccurrenceInAString {

	public static void main(String[] args) {
		
		String st = "welcome to banglr banglr ";
		
		String[] s=st.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
			
		}
		for(String str:set)
		{
			for(int i=0;i<s.length;i++)
			{
				if(str==s[i])
				{
					System.out.println(str+"  "+(i+1)+ " position");
				}
			}
		}
	}

}
