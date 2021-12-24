import java.util.*;
class ReverseNum
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    System.out.print("Reverse no. of "+n+" is ");
    int r=0;
    while(n!=0)
    {
     r=(r*10)+(n%10);
     n/=10;
    }
 
    System.out.println(r);
  }
} 