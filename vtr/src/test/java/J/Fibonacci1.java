package J;

public class Fibonacci1 {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		

		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
