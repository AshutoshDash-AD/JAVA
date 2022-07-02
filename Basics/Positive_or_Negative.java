//Write a code to Check if a Given Number is Positive or Negative

package Basics;

import java.util.Scanner;

public class Positive_or_Negative {
	
	public boolean CheckNum(double n) {
		
		if(n>0)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		
		Positive_or_Negative obj = new Positive_or_Negative();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter a no. to check if it is positive or negative: ");
			double num = sc.nextDouble();
		
			if(num==0)
				System.out.println(num+" is neither Positive nor Negative");
		
			else if(obj.CheckNum(num))
				System.out.println(num+" is Positive");
		
			else
				System.out.println(num+" is Negative");
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Invalid input");
		}
	}
}
