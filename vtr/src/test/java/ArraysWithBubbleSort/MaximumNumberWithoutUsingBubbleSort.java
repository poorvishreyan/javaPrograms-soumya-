package ArraysWithBubbleSort;

public class MaximumNumberWithoutUsingBubbleSort {

	public static void main(String[] args)
	{
		int[] a= {6,1,0,2};
		
		int fmax=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				fmax=a[i];
			}
		}
		System.out.println(fmax);
		
	}
}
