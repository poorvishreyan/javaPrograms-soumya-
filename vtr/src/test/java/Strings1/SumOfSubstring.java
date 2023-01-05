package Strings1;

public class SumOfSubstring {

	public static void main(String[] args) {
		
		String num="421";
		System.out.println(sumOfSubstring(num));
		

	}
	
	public static long sumOfSubstring(String num)
	{
		long sum=0;
		long mf=1;
		for(int i=num.length()-1;i>=0;i--)
		{
			sum+=(num.charAt(i)-'0') * (i+1) *mf;
			mf=mf*10+1;
		}
		return sum;
	}

}
