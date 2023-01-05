package ArraysWithBubbleSort;

public class ArrayInAscendingOrder {

	public static void main(String[] args) {
		
		int a[] = {3,4,1,2};
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			for(int j=i+1;j<a.length;j++)
			{
				//System.out.println(a[j]);
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		
		}
		//for(int i=0;i<a.length;i++)
		//{
			//System.out.println(a[i]);
		//}
	}

}

