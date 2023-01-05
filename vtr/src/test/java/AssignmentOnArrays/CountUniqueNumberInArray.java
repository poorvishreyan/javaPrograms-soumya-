package AssignmentOnArrays;

import java.util.LinkedHashSet;

public class CountUniqueNumberInArray {

	public static void main(String[] args) {


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
				count++;
			}

			if(count==1)
			{
				System.out.println(num+" is unique  " + count);
			}
	}
	}
}
