package ArraysWithBubbleSort;

public class SecondMinimumNumberInArray {
	
public static void main(String[] args) {
		
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
		System.out.println(arr[1]);  //second minimum

		}
		}


