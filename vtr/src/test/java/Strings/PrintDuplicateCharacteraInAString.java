package Strings;

import java.util.LinkedHashSet;

public class PrintDuplicateCharacteraInAString {

	public static void main(String[] args) {
		
		String s ="Tester";
		String s1 = s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s1.charAt(i));
		}
		
		for(Character ch:set)
		{
			int count=0;
			
			for(int i=0;i<s.length();i++)
	{
			if(ch==s1.charAt(i))
			{
				count++;
			}
}
			if(count>1) {
			
			System.out.println(ch+ " "+count);
		}
		}
	}

}
