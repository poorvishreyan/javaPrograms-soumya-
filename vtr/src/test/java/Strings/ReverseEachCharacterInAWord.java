package Strings;

public class ReverseEachCharacterInAWord {

	public static void main(String[] args) {
		
		String st="welcome to bangalore";
		String[] s=st.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			
			System.out.print(" ");
		}

	}

}
