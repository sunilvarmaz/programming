package javaprograms;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int n = 10;
		long factorial = 1;
		for(int i = 1;i<=n;i++) {
			factorial  = factorial * i;
			
		}
		System.out.println("The factorial of a number is" +factorial);
	}

}
