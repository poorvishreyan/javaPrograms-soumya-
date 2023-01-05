package AssignmentOnArrays;

import java.util.LinkedHashSet;

public class CountOrderOfOccurrenceOfEachNumber {

	public static void main(String[] args) {
		
		int[] a = {4,1,1,2,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer num:set)
		{
			
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
				{
					System.out.println(num+"  "+i+ "th position");
				}
				
			}

	}

}
}