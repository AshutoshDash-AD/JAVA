//Write a code to Find the Sum of first N Natural Numbers

package Basics;

import java.util.Scanner;

public class Sum_N_Natural {
	
	public static int GetSum(int n) {
		
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;	
		return sum;
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the value of N to get sum of first N natural no.s: ");
			int n = sc.nextInt();
			
			int res = GetSum(n);
			System.out.println("Sum of first "+n+" natural no.s is "+res);
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Invalid input");
		}
	}
}
