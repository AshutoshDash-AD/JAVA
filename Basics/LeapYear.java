//Write a code to Check whether a given year is a Leap Year or not

package Basics;

import java.util.Scanner;

public class LeapYear {
	
	public static boolean CheckLeap(int y) {
		
		if(y%400 == 0)
			return true;
		if(y%4 == 0 && y%100 != 0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter a year to check if it is leap year or not: ");
			int year = sc.nextInt();
			
			if(CheckLeap(year))
				System.out.println(year+" is a Leap year");
			else
				System.out.println(year+" is not a Leap year");
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Invalid input");
		}
	}
}
