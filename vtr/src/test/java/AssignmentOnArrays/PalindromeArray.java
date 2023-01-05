package AssignmentOnArrays;

public class PalindromeArray {

	public static void main(String[] args) {
		
		
		int[] a = {3,2,5,2,3};
		boolean flag=true;
		for(int start=0,end=a.length-1;start<a.length/2;start++,end--)
		{
			if(a[start]!=a[end])
			{
				flag=false;
				break;
			}
			if(flag==true){
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
		}

	}

}
