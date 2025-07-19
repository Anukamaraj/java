import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number to check if palindrome or not");
    int num=s.nextInt();
    int ans=0;
     int x=num;
    while(num>0)
    {
    int rem=num%10;
    ans=ans*10+rem;
    num=num/10;
    }
    if(x==ans)
    {
        System.out.println("the number is palindrome");
    
    }
    else
    {
        System.out.println("the number is not a palindrome");
    }

}
}