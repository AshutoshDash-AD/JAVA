import java.util.*;
class Harshad
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    int sum=0,p=n;
    while(n!=0)
    {
     sum+=n%10;
     n/=10;
    }
    
    if(p%sum==0) 
      System.out.println(p+" is a Harshad no.");
    else
      System.out.println(p+" is not a Harshad no.");
  }
}