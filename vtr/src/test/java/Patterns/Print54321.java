package Patterns;

public class Print54321 {

	public static void main(String[] args) {
		
		
		for(int rows=1;rows<=2;rows++)
		{
			for(int col=5;col>=1;col--)
			{
				System.out.print(col+" ");
			}
			
			System.out.println();
		}
	}

}
