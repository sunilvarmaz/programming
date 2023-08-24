package javaprograms;



public class SumOfLastDigitsOfTwoNumbers {
	public static void range(int a, int b) {
		while(a<=b) {
			if(a%2  == 0) {
				System.out.println(a);
			}
			a++;
		}
	}
	public static void main(String[] args) {
		range(10,40);
	}

}
