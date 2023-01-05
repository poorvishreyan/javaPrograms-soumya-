package Programs22Sep2022;

import java.util.ArrayList;

public class FibonacciWith3And5Multiples {

	public static void main(String[] args) {
		
		int n=50;
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0;i<50;i++)
		{
			c=a+b;
			
			if(c%3==0 || c%5==0)
			{
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(c);
				
				
			}
			
		}

		System.out.println(c);
	}

}
