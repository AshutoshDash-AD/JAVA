import java.util.*;
class Strong
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a no.");
    int n=sc.nextInt();
    int num=n,sum=0,r;

    while(n!=0)
    {
     r=n%10;
     n/=10;
     
     int p=1;	 
     for(int i=r;i>=1;i--)
       p*=i;
     sum+=p;
    }

    if(sum==num && num!=0)
      System.out.println(num+" is a strong no.");
    else
      System.out.println(num+" is not a strong no.");
  }
}