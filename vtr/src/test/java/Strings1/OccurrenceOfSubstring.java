package Strings1;

public class OccurrenceOfSubstring {

	public static void main(String[] args) {
		
		String s1="malayalam";
		String s2="al";
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				String s3 = s1.substring(i, j+1);
				if(s3.equals(s2))
				{
					count++;
				}
			}
		}
		System.out.println(s2 + " " +count);
	}

}
