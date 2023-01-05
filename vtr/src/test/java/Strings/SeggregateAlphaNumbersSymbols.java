package Strings;

public class SeggregateAlphaNumbersSymbols {

	public static void main(String[] args) {
	
		String s="a1b$c2/3&";
		String alpha = " ";
		String spec = " ";
		String num=" ";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a'&&s.charAt(i)<='z')
				
			{
				alpha = alpha+s.charAt(i);
			}
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num = num+s.charAt(i);
			}
			else {
			spec = spec+s.charAt(i);
			
			}
			
		}
		System.out.println(alpha+num+spec);
	}

}
