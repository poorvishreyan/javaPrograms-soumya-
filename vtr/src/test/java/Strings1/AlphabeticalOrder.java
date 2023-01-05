package Strings1;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		
		String s="laptop";
		int[] count = new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			count[(int)s.charAt(i)]++;
		}
		
		for(int i=0;i<256;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)i+" "+count[i]);
			}
		}

	}

}
