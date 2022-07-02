//Write a code to Check whether a no. is a Prime no. or not

package Basics;

import java.util.Scanner;

public class PrimeNumber {
	
	//1st Method
	public static boolean isPrime(int num) {

		boolean k = true;
		
		if(num<2)
			return false;
		else {
			double n = (double)num;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					k = false;
					break;
				}
			}
		}	
		return k;
	}
	
	//2nd Method
	public static boolean IsPrime(int num) {
		
		boolean k = true;
		
		if(num<2)
			return false;
		else if(num==2)
			return true;
		else if(num%2==0)
			return false;
		else {
			double n = (double)num;
			for(int i=2;i<=Math.sqrt(n);i+=2) {
				if(n%i==0) {
					k = false;
					break;
				}
			}
		}
		return k;
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter a no. to check if it is Prime or not: ");
			int n = sc.nextInt();
			
			if(IsPrime(n))
				System.out.println(n+" is a Prime number");
			else
				System.out.println(n+" is not a Prime number");
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Invalid input");
		}	
	}
}
