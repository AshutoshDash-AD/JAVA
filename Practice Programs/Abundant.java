import java.util.*;
class Abundant
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a no.");
    int n=sc.nextInt();

    int sum=1;
    for(int i=2;i<n;i++)
    {
     if(n%i==0)
        sum+=i;
    }
    
    if(sum>n)
       System.out.println(n+" is an Abundant no.");
    else
      System.out.println(n+" is not an Abundant no.");    
  }
}