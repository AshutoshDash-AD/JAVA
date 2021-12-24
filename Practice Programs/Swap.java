import java.util.*;
class Swap
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c;

    System.out.println("Enter 2 no.s:");
    a=sc.nextInt();
    b=sc.nextInt();

    System.out.println("Current value of a is "+a+" and b is "+b);
    System.out.print("After swapping using temporary variable, ");
    c=a;
    a=b;
    b=c;
    System.out.println("value of a is "+a+" and b is "+b);

    System.out.println("\nEnter 2 no.s:");
    a=sc.nextInt();
    b=sc.nextInt();
    
    System.out.println("Current value of a is "+a+" and b is "+b);
    System.out.print("After swapping using arithmetic operator, ");
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("value of a is "+a+" and b is "+b);

    System.out.println("\nEnter 2 no.s:");
    a=sc.nextInt();
    b=sc.nextInt();
    
    System.out.println("Current value of a is "+a+" and b is "+b);
    System.out.print("After swapping using bitwise xor operator, ");
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("value of a is "+a+" and b is "+b);
  }
}


    
    