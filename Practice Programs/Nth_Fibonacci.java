import java.util.*;
class Nth_Fibonacci
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    System.out.print(n+"th no. of the Fibonacci Series is ");     
    
    int a=0,b=1,cnt=0;
    while(cnt<=n)
    {
     if(cnt==n)
        System.out.println(a);
     int c=a+b;
     a=b;
     b=c;
     cnt++;
    }    
  }
}