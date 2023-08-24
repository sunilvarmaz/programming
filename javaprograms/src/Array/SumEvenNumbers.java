package Array;

import java.util.Scanner;

public class SumEvenNumbers {
	public static int eve(int n) {
		int sum  = 0;
		for(int i = 2;i<=n;i+=2) {
			sum = sum + i;
			
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n + "is "+ eve(n));
	}
	
	
}


