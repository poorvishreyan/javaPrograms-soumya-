package Strings;

import java.util.LinkedHashSet;                            //wrong

public class StringCountUniquely {

	public static void main(String[] args) {
		
		String st="welcome to bangalore city";
		String[] s = st.split("");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for(String str:set)
		{
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				if(str==s[i])
				{
					count++;
				}
				
				if(count==1)
				{
					System.out.println(str+" is unique "+count);
				}
			}
			
		}

	}

}
