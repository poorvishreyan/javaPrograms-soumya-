package ArraysWithBubbleSort;

public class AscendingAndDescendingNumberArray {
	
	public static void main(String[] args)
	{
		int[] arr = {10,24,89,92,16,56};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
	
		}
	}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("=================");
		
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
}
}
