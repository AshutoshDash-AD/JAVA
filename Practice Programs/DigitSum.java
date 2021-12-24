import java.util.*;
class DigitSum
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    System.out.print("Sum of digits of "+n+" is ");
    int sum=0;
    while(n!=0)
    {
     sum+=n%10;
     n/=10;
    }
     
    System.out.println(sum);
  }
}