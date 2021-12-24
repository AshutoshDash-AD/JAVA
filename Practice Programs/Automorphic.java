import java.util.*;
class Automorphic
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a no.");
    int n=sc.nextInt();

    String s1=Integer.toString(n);
    String s2=Integer.toString(n*n);

    if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1))
       System.out.println(n+" is an Automorphic no.");
    else
      System.out.println(n+" is not an Automorphic no.");
  }
}