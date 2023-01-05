package Programs22Sep2022;

public class NumberOfOccurrenceOfCharacter {

	public static void main(String[] args) {
		
		String s="welcome";
		char[] ch = s.toCharArray();
		
		
		for(int i=0;i<s.length()-1;i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			System.out.println(ch[i]+" "+count);
		}
		

	}

}
