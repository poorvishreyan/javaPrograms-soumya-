package Strings;

public class ReverseAString1 {

	public static void main(String[] args) {
		
		String s="bangalore";
		char[] ch=s.toCharArray();
		
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		
		for(int i=count-1;i>=0;i--) {
			System.out.println(ch[i]);
		}

	}

}
