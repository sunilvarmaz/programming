package javaprograms;

public class Fibonacci {
	public static void main(String[] args) {
		int n  =10;
		int a = 0;
		int b = 1;
		if( n  == 1) {
			System.out.println(a);
			System.out.println(b);
		}
		for(int i = 1;i<=n;i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

}
