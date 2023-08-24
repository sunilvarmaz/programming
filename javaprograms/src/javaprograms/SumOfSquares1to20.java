package javaprograms;

public class SumOfSquares1to20 {
	public static void main(String[] args) {
		int  i = 0;
		int sum = 0;
		while(i<=20) {
			sum = sum + (i *i);
			i++;
		}
		System.out.println(sum);
	}

}
