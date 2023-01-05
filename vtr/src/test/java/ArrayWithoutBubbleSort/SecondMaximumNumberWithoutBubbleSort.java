package ArrayWithoutBubbleSort;

public class SecondMaximumNumberWithoutBubbleSort {
	
	public static void main(String[] args)
	{
		int[] a = {1,4,2,3};
		int fmax=a[0];
		int smax=a[1];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println(fmax+    " "     +smax);
	}

	

}

