package Strings;

public class PrintReverse {

	public static void main(String[] args) {
		
		//reverse the string
		
		String s="bangalore";
		//char[] s1=s.toCharArray();
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
