package ArrayWithoutBubbleSort;

public class FirsttMinimumNumberWithoutBubbleSort {

	public static void main(String[] args) {
		
		
			
			int[] a= {6,4,2,8};
			int fmin = a[0];
			
			for(int i=1;i<a.length;i++)
			{
				if(fmin>a[i])
				{
					fmin=a[i];
					
				}
			}
			System.out.println(fmin);
	
			System.out.println(a[1]);    //second minimum number

		}
	

}


