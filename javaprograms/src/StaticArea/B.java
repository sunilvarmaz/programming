package StaticArea;

public class B {
	public static void A(){
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		A();
		B.A();
	}

}
