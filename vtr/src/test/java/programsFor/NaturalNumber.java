package programsFor;

public class NaturalNumber {

	public static void main(String[] args) {
		
		/*int num=5;
		int sum=addNum(num);
		System.out.println("sum is: " + sum);*/
		System.out.println(addNum(5));

	}
	
	public static int addNum(int num)
	{
		if(num!=0)
		{
			return num + addNum(num-1);
		}
		else {
			return num;
		}
	}

}
