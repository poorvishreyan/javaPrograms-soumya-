package Strings1;

public class FirstLetterFromString {

	public static void main(String[] args) {
		
		
		String s="This is java";
		String[] st = s.split(" ");
		
		for(int i=0;i<st.length;i++)
		{
			String str = st[i];
			System.out.println(str.charAt(0));
		}

	}

}
