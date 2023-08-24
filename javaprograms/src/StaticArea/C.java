package StaticArea;

public class C {
	public static void D() {
		System.out.println("hello");
	}
	static int a = 20;
	public static void main(String[] args) {
		System.out.println(C.a);
		System.out.println(a);
		D();
		C.D();		
	}
	
		
	
	

}
