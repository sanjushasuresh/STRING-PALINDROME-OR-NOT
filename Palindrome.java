import java.util.Scanner;
public class Palindrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter a string");
    String str=sc.nextLine();
    String rev="";
    int length=str.length();
    for(int i=length-1;i>=0;i--)
    {
      rev=rev+str.charAt(i);
    }
    System.out.println("The reversed string is: "+rev);
    if(str.equals(rev))
    {
      System.out.println(str+" is a palindrome");
    }
    else
    {
      System.out.println(str+" is not a palindrome");
    }
  }
}