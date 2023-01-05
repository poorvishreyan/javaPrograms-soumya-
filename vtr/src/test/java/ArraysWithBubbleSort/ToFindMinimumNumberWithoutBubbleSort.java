package ArraysWithBubbleSort;

public class ToFindMinimumNumberWithoutBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {6,7,3,2};
		
		int fmin = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(fmin>a[i])
			{
				fmin=a[i];
				
			}
			
			
		}
		System.out.println(fmin);
	}

}
