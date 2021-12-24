import java.util.Scanner;
class Max
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter 3 no.s");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  
  if(a>b)
  {
    if(a>c)
       System.out.println("Greatest no. is "+a);
    else 
       System.out.println("Greatest no. is "+c);
  }
  else
  {
    if(b>c)
      System.out.println("Greatest no. is "+b);
    else
        System.out.println("Greatest no. is "+c);
  }
 }
}  