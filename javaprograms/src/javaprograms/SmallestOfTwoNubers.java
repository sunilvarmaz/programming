package javaprograms;

public class SmallestOfTwoNubers {
	public static void main(String[] args) {
		int a  = 233;
		int b  =45;
		int c = 21;
		
		if(a<b && a<c) {
			System.out.println(a + "it is a smallest value");
		}
		else if (b<c) {
			System.out.println(b +" it is a smallest value");
		}
		else {
			System.out.println(c + " it is a smallest value");
		}
	}

}
