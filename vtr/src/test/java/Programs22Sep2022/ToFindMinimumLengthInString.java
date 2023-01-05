package Programs22Sep2022;

public class ToFindMinimumLengthInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"abc", "abcd","de" ,"abcdef","ab","uv"};
		String minLength = s[0];
		
		for(int i=1;i<s.length;i++)
		{
			
			if(minLength.length()>s[i].length())
			{
				minLength=s[i];
				
			}
		
			
			}
		System.out.println(minLength);
		}
	}


