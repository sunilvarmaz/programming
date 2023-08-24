package StaticVariabe;
class mobile{
	String brand ;
	String Model;
	int Network;

public  void Display(){
	System.out.println(brand+" "+Model+" "+Network);
	
}
}

public class Demo {
	public static void main(String[] args) {
		mobile mb = new mobile();
		mb.brand = "noika";
		mb.Model = "XX";
		mb.Network = 5;
		mb.brand = "samsung";
		mb.Display();
	}
}
