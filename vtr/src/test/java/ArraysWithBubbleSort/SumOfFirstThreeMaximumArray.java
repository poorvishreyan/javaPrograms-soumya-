package ArraysWithBubbleSort;

public class SumOfFirstThreeMaximumArray {

	public static void main(String[] args) {
		
		int[] a = {6, 1, 7,5,8,3};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		int sum=0;
		for(int i=3;i<6;i++)
		{
			sum=sum+a[i];
			System.out.println(a[i]);
		}
		
		System.out.println("The sum of maximum three array is : "  +sum);

	}

}
