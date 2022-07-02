//Write a code to Find the Greatest of the Three Numbers

package Basics;

import java.util.Scanner;

public class GreatestNumber {
	
	//1st Method
	public static void FindMax(int a,int b,int c) {
		
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is the greatest no.");
			else
				System.out.println(c+" is the greatest no.");
		}
		else
		{
			if(b>c)
				System.out.println(b+" is the greatest no.");
			else
				System.out.println(c+" is the greatest no.");
		}
	}
	
	//2nd Method
	public static void findMax(int a,int b,int c) {
		
		if(a>b && a>c)
			System.out.println(a+" is the greatest no.");
		if(b>a && b>c)
			System.out.println(b+" is the greatest no.");
		if(c>a && c>b)
			System.out.println(c+" is the greatest no.");
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter three numbers to find the greatest one: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			
			if(num1==num2 && num2==num3)
				System.out.println("All the numbers are equal");
			
			else
				FindMax(num1, num2, num3);
			
		}catch(Exception e) { 
			System.out.println(e.getMessage()+" Invalid input");
		}

	}

}
