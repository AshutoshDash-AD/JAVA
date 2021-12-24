import java.util.*;
class FriendlyPair
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter two no.s");
    int a=sc.nextInt();
    int b=sc.nextInt();

    int sum1=1,sum2=1;
    for(int i=2;i<a;i++)
    {
     if(a%i==0)
        sum1+=i;
    }
    for(int i=2;i<b;i++)
    {
     if(b%i==0)
        sum2+=i;
    }

    if(sum1==b && sum2==a)
       System.out.println(a+" and "+b+" are Friendly Pair");
    else
      System.out.println(a+" and "+b+" are not Friendly Pair");
  }
}