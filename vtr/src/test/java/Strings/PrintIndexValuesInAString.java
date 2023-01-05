package Strings;

import java.util.LinkedHashSet;

public class PrintIndexValuesInAString {

	public static void main(String[] args) {
		
		String s="hello";
		
		//LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i)+ " " + (i+1));
		}

	}

}
