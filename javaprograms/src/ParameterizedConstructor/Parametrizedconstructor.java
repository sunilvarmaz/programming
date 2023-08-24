package ParameterizedConstructor;

public class Parametrizedconstructor {
	int a;
	int b;

	Parametrizedconstructor(int a, int b) {
		this.a  = a;
		this.b = b;
		
	}
	public static void main(String[] args) {
		Parametrizedconstructor obj = new Parametrizedconstructor(20,30);
		Parametrizedconstructor obj2 = new Parametrizedconstructor(40,30);
		System.out.println(obj.a);
		System.out.println(obj2.b);
	}
	

}
