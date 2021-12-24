import java.util.*;
class Factor
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   
    System.out.println("Enter a no.");
    int n=sc.nextInt();
    
    System.out.println("Factors of "+n+" are ");
    System.out.print(1+"  ");

    for(int i=2;i<=n;i++)
    {
     if(n%i==0)
        System.out.print(i+"  ");
    }
  }
}