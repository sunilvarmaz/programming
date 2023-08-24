package MethodcalledStatements;

public class A {
	public static void test() {
		System.out.println("Test Started");
		System.out.println("Test Ended");
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		test();
		System.out.println("main method is ended");
	}

}
