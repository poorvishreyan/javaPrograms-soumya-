package Patterns;

public class PrintSquarePrint {

	public static void main(String[] args) {
		
		
		for(int rows=1;rows<=4;rows++)
		{
			for(int col=1;col<=4;col++)
			{
			if(rows==1 || rows==4 || col==1 || col==4)
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
