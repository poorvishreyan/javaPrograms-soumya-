package ArraysWithBubbleSort;

public class PalindromeInArray {

	public static void main(String[] args) {

		int[] a = {34,56,23,89,67};
		
		for(int i=0;i<a.length;i++)
		{
			int rev=0;
			int n=a[i];
			
			while(n>0)
			{
				int digit=n%10;
				rev = rev*10+digit;
				int temp = n/10;
			}
			
			if(a[i]==rev)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println();

	}

}
