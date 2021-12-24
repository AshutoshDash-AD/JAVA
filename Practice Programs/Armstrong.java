import java.util.*;
class Armstrong
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    int p=n,sum=0;
    while(n!=0)
    {
     sum+=Math.pow((n%10),3);
     n/=10;
    }
    
    if(sum==p) 
      System.out.println(p+" is an Armstrong no.");
    else
       System.out.println(p+" is not an Armstrong no.");
  }
}