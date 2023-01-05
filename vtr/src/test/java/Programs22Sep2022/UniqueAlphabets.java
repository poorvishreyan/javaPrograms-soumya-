package Programs22Sep2022;

public class UniqueAlphabets {

	public static void main(String[] args) {
		
		String s="hello";
		char[] ch=s.toCharArray();
		int n=ch.length;
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				
				if(ch[i]==ch[j])
				{
					count++;
				}
				for(int k=j;k<n-1;k++) {
					ch[k]=ch[k+1];
					
				}
				n--;
				j--;
			}
		}
		if(count==1)
		{
			System.out.println(ch[i]);
		}
			
		}
	}
				
	


