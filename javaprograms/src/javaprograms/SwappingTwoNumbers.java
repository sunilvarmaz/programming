package javaprograms;

import java.util.Scanner;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swapping the numbers:"+a+" "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping the numbers:"+a+" "+b);
		
	
	}

}
