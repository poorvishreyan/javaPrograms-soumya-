package J;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		int num=100;
		int sum=0;
		
		//1+2+3+4----------100=>5050
		
		for(int i=1;i<=num;i++)
		{
			sum = sum+i;
		}
		
		System.out.println("sum is :"  +sum);

	}

}
