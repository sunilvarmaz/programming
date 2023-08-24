package NonStatic;

public class A {
	static void A1() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.A1();
	
	}

}
