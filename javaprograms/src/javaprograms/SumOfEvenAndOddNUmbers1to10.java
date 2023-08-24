package javaprograms;

public class SumOfEvenAndOddNUmbers1to10 {
	public static void main(String[] args) {
		int  i = 1;
		int esum = 0;
		int osum = 0;
		while(i<=20) {
			if(i%2 == 0) {
				esum = esum + i;
			}
			else {
				osum = osum + i;
			}
			i++;
			System.out.println(esum);
			System.out.println(osum);
			
		}
	}

}
