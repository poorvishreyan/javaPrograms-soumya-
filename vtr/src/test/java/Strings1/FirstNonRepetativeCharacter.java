package Strings1;

public class FirstNonRepetativeCharacter {

	public static void main(String[] args) {
		
		String str="testing";
		
		
		
		for(  char i : str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.println("first non-repetative character is: "+i);
				break;
			}
		}

	}

}
