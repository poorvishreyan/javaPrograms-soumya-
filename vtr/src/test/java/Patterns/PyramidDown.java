package Patterns;

public class PyramidDown {
	public static void main(String[] args)
	{
	int n=7;
	for(int rows=n;rows>0;rows--)
	{
	for(int col=n;col>0;col--)
	{
	if(rows>=col)
	{
	System.out.print("*  ");
	}
	//else
	
	System.out.print(" ");
	}
	System.out.println();
	}
	}
	}
	
