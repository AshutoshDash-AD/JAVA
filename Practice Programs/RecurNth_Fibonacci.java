import java.util.*;
class RecurNth_Fibonacci
{ 
  public static int fib(int n)
  {
    if(n<=1)
       return n;

    return fib(n-1)+fib(n-2);
  }
 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a no.");
    int n=sc.nextInt();

    int p=fib(n);
    System.out.println(n+"th no. in the Fibonacci Series is "+p);
  }
}