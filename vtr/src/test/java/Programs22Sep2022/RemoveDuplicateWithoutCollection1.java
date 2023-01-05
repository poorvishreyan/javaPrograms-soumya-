package Programs22Sep2022;

public class RemoveDuplicateWithoutCollection1 {

	public static void main(String[] args) {                      //Bindura
		// TODO Auto-generated method stub

		String s1= "welcome";
		System.out.println("s1=" +s1);
		
		char[] arr = s1.toCharArray();
		
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				
				if(arr[i]==arr[j])
				{
					for(int start=j;start<n-1;start++)
					{
						arr[start]=arr[start+1];
					}
					n--;
					j--;
					
				}
			}
		}
		
		String s2="";
		for(int i=0;i<n;i++)
		{
			s2=s2+arr[i];
		}
		
		System.out.println("s2="+s2);
}
}