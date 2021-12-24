import java.util.*;
class NArmstrong
{
  public static void isArm(int n)
  {
    int p=n,sum=0;
    while(n!=0)
    {
     sum+=Math.pow((n%10),3);
     n/=10;
    }
    
    if(sum==p)
       System.out.print(p+"  ");
  }
 
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    System.out.println("\nArmstrong no.s upto "+n+" are "); 
    for(int i=0;i<=n;i++)
      isArm(i);
  }
}