package ArraysWithBubbleSort;

public class Anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="welcome to the world";
		String[] s=st.split("  ");
		String rev="";
		for(int i=0;i<s.length;i++) {
			String str=s[i];
			for(int j=str.length()-1;j>=0;j--) {
				rev=rev+str.charAt(j);
			}
			
		}
		System.out.print(" ");
		System.out.print(rev);
		
	}

}
