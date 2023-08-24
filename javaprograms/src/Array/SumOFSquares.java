//sum of squares of numbers divisible by 3
package Array;

import java.util.Scanner;

public class SumOFSquares {
	public static int sum(int i, int j) {
		if(j>i) {
			int sum = 0;
			for(int a = i;a<=j;a++) {
				if(a%3==0||a%5 == 0){
					sum = sum +(a *a);
					
				}
				
			}
			return sum;
			
		}
		else {
		int add = 0;
		for(int c = j; c>=i;c--) {
			if(c%3==0||c%5 == 0) {
				add = add +(c *c);
				
			}
		}
		return add;
			
		}
		
}
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the nubers");
		int a = sc.nextInt();
		int b   = sc.nextInt();
		int sum = sum(a,b);
		System.out.println(sum);
	}

}
