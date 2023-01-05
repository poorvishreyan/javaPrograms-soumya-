package Strings;

public class AddingSpacesBetweenStrings {

	public static void main(String[] args) {
		
		String s="WelcomeToJavaWorld";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				//ch[i]= (char)(ch[i]+32);
				
				if(i!=0)
				
					System.out.print(" ");
					System.out.print(ch[i]);
				}
				else {
					System.out.print(ch[i]);
				}
			}
		}

	}


