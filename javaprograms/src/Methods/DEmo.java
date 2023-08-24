package Methods;

class  Computer {
	public   void playlist() {
		
		System.out.println("Music is playing");
	}
	public String GetPen() {
		return "pen";
	}
}


public class DEmo {
	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.playlist();
		String str = obj.GetPen();
		System.out.println(str);

}
}
