package Strings1;

import java.util.Scanner;

public class NumberOfOccurrenceOfCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		
		String str = sc.nextLine();
		int initialLength = str.length();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the character to find the occurrence");
		String str1 = sc.next();
		str = str.replace(str1, "");
		int finalLength = str.length(); 
		System.out.println("total number of occurrence of characterrrs" +str1+ " "+(initialLength-finalLength));
	}

}
