import java.util.*;
class PallindromeNum
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    int p=n,r=0;
    while(n!=0)
    {
     r=(r*10)+(n%10);
     n/=10;
    }
 
    if(p==r)
     System.out.println(p+" is a pallindrome no.");
    else
     System.out.println(p+" is not a pallindrome no.");
  }
} 