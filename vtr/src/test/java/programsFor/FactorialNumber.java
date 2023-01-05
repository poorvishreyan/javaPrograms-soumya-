package programsFor;

public class FactorialNumber {

	public static void main(String[] args) {
		
		
		int num=5;
		getFact(num);
	}
	
	public static void getFact(int num)
	{
		int  fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of "+ num + " is :"+ fact );
	}

}
