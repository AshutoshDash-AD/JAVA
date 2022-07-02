//Write a code to Find the Sum of the Digits of a Number

package Basics;

import java.util.Scanner;

public class Sum_of_Digits {
	
	public static int DigitSum(double num) {
		
		String s = String.valueOf(num).replace(".", "").replace("-", "");
		int n = Integer.parseInt(s);
		
		int sum=0,r=0;
		while(n!=0) {
			r = n%10;
			sum += r;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter a no. to find its sum of digits: ");
			double num = sc.nextDouble();
			
			int res = DigitSum(num);
			System.out.println("Sum of digits of "+num+" is "+res);
		
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Invalid input");
		}
	}
}
