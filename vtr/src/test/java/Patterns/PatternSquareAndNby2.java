package Patterns;

public class PatternSquareAndNby2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;col<=n;col++)
			{
				if(rows==1 || rows==n || col==1 || col==n || rows==(n/2)+1 || col==(n/2)+1)
				{
					System.out.print("*   ");
				}
				else
				{
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}

}
