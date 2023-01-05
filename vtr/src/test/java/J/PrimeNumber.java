package J;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i=1;
		int n=11;
		int count=0;
		
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else {
			System.out.println("composite");
		}
	}

}
