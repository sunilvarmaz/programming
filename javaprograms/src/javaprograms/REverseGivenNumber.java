package javaprograms;

public class REverseGivenNumber {
	static int reverse(int i) {
		int rem  = 0;
		int rev = 0;
		while(i >=0) {
			rem = i % 10;
			rev = rev * 10 + rem;
			i = i / 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int  i = 1234;
		System.out.println(reverse(i));
	}
	

}
