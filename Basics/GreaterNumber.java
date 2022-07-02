//Write a code to Find the Greatest of the Two Numbers

package Basics;

import java.util.Scanner;

public class GreaterNumber {
	
	public static boolean FindMax(int num1,int num2) {
		
		if(num1>num2)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter two numbers to find the greater one: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1==num2)
				System.out.println("Both the numbers are equal");
			
			else if(FindMax(num1, num2))
				System.out.println(num1+" is greater than "+num2);
			
			else
				System.out.println(num2+" is greater than "+num1);
		}catch(Exception e) { 
			System.out.println(e.getMessage()+" Invalid input");
		}
	}
}
