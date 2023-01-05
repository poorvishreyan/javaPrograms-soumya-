package Programs22Sep2022;

public class PrintDuplicateCharacterInAString1 {

	public static void main(String[] args) {
		
		String s1= "welcome";
		System.out.println("s1=" +s1);
		
		char[] arr = s1.toCharArray();
		
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
					int k=j;
					
					while(k<n-1)
					{
						arr[k]=arr[k+1];
						k++;
					}
						
					
					n--;
					j--;
				}
				}
			if(count>1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
