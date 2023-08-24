package javaprograms;

public class EvenOrOddUsingSwitch {
	public static void main(String[] args) {
		int num  = 100;
		switch(num % 2) {
		case 0:System.out.println("even number");
		break;
		default:System.out.println("odd number");
		}
		
	}

}
