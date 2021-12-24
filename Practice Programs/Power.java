import java.util.*;
class Power
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the base and exponent:");
    int bs=sc.nextInt();
    int ex=sc.nextInt();
    int p=1,e=ex;	

    while(ex-->0)
        p*=bs;

    System.out.println(bs+" raised to the power "+e+" is "+p);
  }
}