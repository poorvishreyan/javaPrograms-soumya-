package Strings1;

public class InsertAStringInbetween {

	public static void main(String[] args) {
		
		String originalString="WelcomeJava";
		String stringToBeInserted="To";
		int index=6;
		String newString=" ";
		
		for(int i=0;i<originalString.length();i++)
		{
			newString = newString+originalString.charAt(i);
			
			if(i==index)
			{
				newString+=stringToBeInserted;
			}
		}
		System.out.println(newString);
	}

}
