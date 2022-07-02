//Write a code to Check Whether a Number is Even or Odd

package Basics;

import java.util.Scanner;

public class Even_or_Odd {
	
	public boolean CheckNum(double n) {
		
		if(n%2==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Even_or_Odd obj = new Even_or_Odd();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {		
			System.out.print("Enter a no. to check if it is even or odd: ");
			double num = sc.nextDouble();
		
			if(obj.CheckNum(num))
				System.out.println(num+" is an Even number");
			else
				System.out.println(num+" is an Odd number");
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Invalid input");
		}
	}
}
