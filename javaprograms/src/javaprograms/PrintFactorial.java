package javaprograms;

public class PrintFactorial {
	public static void fact(int a) {
		int sum = 1;
		for(int i = 1;i<=a;i++) {
			sum = sum * i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		fact(10);
	}

}
