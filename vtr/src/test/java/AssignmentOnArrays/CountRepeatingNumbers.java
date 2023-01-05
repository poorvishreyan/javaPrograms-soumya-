package AssignmentOnArrays;

import java.util.LinkedHashSet;

public class CountRepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4,1,1,2,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer num:set)
		{
			int count=0;
			
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
				{
					count++;
				}
			}
			
			System.out.println(num+" "+count);
		}

	}

}
