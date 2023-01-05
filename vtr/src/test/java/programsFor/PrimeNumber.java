package programsFor;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(checkPrimeNumber(17));

	}
	
	public static boolean checkPrimeNumber(int num)
	{
		boolean isPrime=true;
		for(int i=2;i<num/2 ;i++)
		{
			if(num%2==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

}
