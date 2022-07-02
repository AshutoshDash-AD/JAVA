//Write a code to Find the Sum of the Numbers in a Given Range

package Basics;

import java.util.Scanner;

public class Sum_in_Range {
	
	public static int GetSum(int a, int b) {
		
		int sum = 0;
		for(int i=a;i<=b;i++)
			sum += i;
		return sum;
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the value of a: ");
			int a = sc.nextInt();
			System.out.print("Enter the value of b: ");
			int b = sc.nextInt();
			
			int res = GetSum(a,b);
			System.out.println("Sum of numbers between "+a+" to "+b+" is "+res);
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Invalid input");
		}
	}

}
