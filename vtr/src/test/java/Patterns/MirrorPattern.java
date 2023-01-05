package Patterns;

public class MirrorPattern {

	public static void main(String[] args) {
		
		int n=5, m=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i>=j) {
					
				
				System.out.print("*  ");
			}
			else if(i+j>=m-1);
			{
				System.out.print("* ");
			}
				System.out.print("           ");
		}
		System.out.println();

	}
	}

}
