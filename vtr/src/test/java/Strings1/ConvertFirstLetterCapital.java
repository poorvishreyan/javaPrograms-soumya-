package Strings1;

public class ConvertFirstLetterCapital {

	public static void main(String[] args) {
		
		String s="this is india";
		String[] st=s.split(" ");
		
		for(int i=0;i<st.length;i++)
		{
			String str = st[i];
			str = str.substring(0,1).toUpperCase()+str.substring(1);
			
			System.out.println(str);
		}
		

	}

}
