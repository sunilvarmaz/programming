package javaprograms;

public class SumOfEvenNumbers1to30 {
	public static void main(String[] args) {
		int i = 1;
		int sum  =0;
		while(i<=30) {
			if(i %2 == 0) {
				sum = sum + i;
				
			}
			i++;
			System.out.println(sum);
		}
	}

}
