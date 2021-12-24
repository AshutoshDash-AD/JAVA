import java.util.*;
class NFibonacci
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    System.out.println("First "+n+" no.s of the Fibonacci Series are");     
    

    int a=0,b=1,cnt=0;
    while(cnt<n)
    {
     System.out.print(a+"  ");
     int c=a+b;
     a=b;
     b=c;
     cnt++;
    }    
  }
}