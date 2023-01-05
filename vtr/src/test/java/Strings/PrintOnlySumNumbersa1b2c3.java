package Strings;

public class PrintOnlySumNumbersa1b2c3 {

	public static void main(String[] args) {
		
		String s="a1b2c3";
		int count=0;
		String num=" ";
		String alph=" ";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				alph = alph+s.charAt(i);
			}
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				
			int m=	s.charAt(i)-48;
			count = count+m;
				
			}
			
			
		}
		System.out.println(count);
		

	}

}
