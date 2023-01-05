package Programs22Sep2022;

public class FindMissingNumInArray {

	public static void main(String[] args) {
		
		int[] ar = {10,15,19,25};
		
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.println(ar[i]);
			
			for(int j=ar[i]+1;j<ar[i+1];j++)
			{
				System.out.println(j);
			}
		}
		

	}

}
