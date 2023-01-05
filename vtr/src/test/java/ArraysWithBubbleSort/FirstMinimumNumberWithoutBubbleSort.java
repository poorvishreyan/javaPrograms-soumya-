package ArraysWithBubbleSort;

public class FirstMinimumNumberWithoutBubbleSort {

	public static void main(String[] args) {
		
		int[] a= {10,24,89,92,16,56};
		int fmin = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(fmin>a[i])
			{
				fmin=a[i];
				
			}
		}
		System.out.println(fmin);
		//System.out.println(a[1]);

	}
		

}
