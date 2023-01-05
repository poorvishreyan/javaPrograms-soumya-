package ArrayWithoutBubbleSort;

public class FirstTwoMinimumNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6,1,0,2,0};
		
		int fmin = a[0];
		int smin = a[1];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=a[i];
			}else if(fmin==smin || smin>a[i])
			{
				smin=a[i];
			}
		}
		System.out.println(fmin+  "  " +smin);

	}

}
