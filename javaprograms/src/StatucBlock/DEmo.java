package StatucBlock;

import StaticVariabe.mobile;

class mobile{
	String brand ;
	String Model;
	int Network;

	static {
		System.out.println("it is a static block");
	}
	public mobile(){
		brand = "samsung";
		Model = "xyx";
		Network = 5;
		System.out.println("it is a constructor");
		
	}

public  void Display(){
	System.out.println(brand+" "+Model+" "+Network);
	
}
}

public class DEmo {
	public static void main(String[] args) {
		mobile mb = new mobile();
	}

}
