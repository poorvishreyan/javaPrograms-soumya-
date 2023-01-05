package Strings1;

public class RemoveTheSpaces {

	public static void main(String[] args) {
		
		String s="I Love India";
		String str=" ";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				str=str+s.charAt(i);
			}
		}
		System.out.println(str);

	}

}
