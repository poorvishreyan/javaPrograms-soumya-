package Strings1;

public class DuplicateWord {

	public static void main(String[] args) {
		
		String s="java selenium java  java java selenium programming session";
		String[] st = s.split(" ");
		
		//int count=0;
		for(int i=0;i<st.length;i++)
		{
			 int count=1;
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
				{
					count++;
					//Set st[j] to 0 to avoid printing visited word 
					st[j]="0";
				}
			}
		
			if(count>1 && st[i]!="0")
			{
				
				System.out.println(st[i]);
				
			}
		}
	}

}
