import java.util.*;
class Prime
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    int cnt=0;
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
         cnt++;
    }
    
    if(cnt==2)
       System.out.println(n+" is a prime no.");
    else
       System.out.println(n+" is not a prime no.");
  }
}  