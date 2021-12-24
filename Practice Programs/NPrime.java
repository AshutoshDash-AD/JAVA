import java.util.*;
class NPrime
{
  public static void isPrime(int n)
  {
    int cnt=0;
    
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
         cnt++;
    }

    if(cnt==2)
       System.out.print(n+"  ");
  }
 
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    if(n==0 || n==1)
       System.out.println("There are no prime no.s upto "+n);
    
    else
       System.out.println("Prime no.s upto "+n+" are ");

    for(int i=2;i<=n;i++)
        isPrime(i);
  }
}  