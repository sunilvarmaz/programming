package MethodcalledStatements;

public class SumAandB {
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add(20,30);
		add(10,'a');
	}

}
