package Strings1;

public class SumOfSubStringNumber {

	public static void main(String[] args) {
		
		String s="12983476";
		
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				
				 String s2 = s.substring(i, j+1);
				 
				 if(s2.length()==4)
				 {
					int num = Integer.parseInt(s2);
					if(num%3==0)
					{
						System.out.println(s2);
					}
				 }
			
			}
		}
		

	}

}
