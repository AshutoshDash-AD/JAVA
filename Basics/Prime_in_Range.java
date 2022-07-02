//write a code to Find the Prime Numbers within a given range 

package Basics;

import java.util.Scanner;

public class Prime_in_Range {
	
	public static boolean isPrime(int num) {
		
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
			System.out.println("Enter two numbers to find the prime no.s between them: ");
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			System.out.print("Prime no.s between "+a+" and "+b+": ");
			for(int i=a;i<=b;i++)
				if(isPrime(i))
					System.out.print(i+" ");
		
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Invalid input");
		}
	}
}
