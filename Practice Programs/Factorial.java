import java.util.*;
class Factorial
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    int p=1;
    for(int i=n;i>=1;i--)
       p*=i;

    System.out.println("Factorial of "+n+" is "+p); 	
  }
}