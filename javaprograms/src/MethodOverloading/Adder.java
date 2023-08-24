package MethodOverloading;

public class Adder {
	static int add(int a, int b) {
		return(a +b);
	}
	static int add(int a, int b, int c) {
		return (a+b+c);
	}
	public static void main(String[] args) {
		System.out.println(Adder.add(20,30));
		System.out.println(Adder.add(20, 30, 40));
		
	}

}
