package Patterns;

public class PatternWrongMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;col<=n;col++)
			{
				if(rows==1 || rows==n || col==1 || col==n || rows==col || rows+col==n+1)
				{
					System.out.print("*  ");
				}
				else {
					
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
