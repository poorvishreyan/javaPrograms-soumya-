package J;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=121, rem=0, sum=0, temp=num;
				
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
