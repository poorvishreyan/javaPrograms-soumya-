package Strings1;

public class OccurranceOfEachCharacter {

	public static void main(String[] args) {
		
		String s="aabbbccccdd";
		int count=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			
			try {
				if(ch[i]==ch[i+1])
				{
					count++;
				} 
				else {
					count++;
					System.out.println(count +" "+ch[i]);
					count=0;
				}
			
			}catch (Exception e) {
				count++;
				System.out.println(count+" "+ch[i]);
				
			}
			
			
			
		}
		
	
	}

}
