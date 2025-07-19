import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        System.out.println("enter the number to check if it is prime or not");
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        primeee(n);
    }
    public static void primeee(int n)
    {
        if(n<=1)
        {
            System.out.println("the num is prime");
        }
        for (int i=2;i<=n;i++)
        {
        if(n%i==0)
        {
            System.out.println(n+""+"is not a prime number" );
            
        }
        }
        
            System.out.println("it is a prime number");
            
        
        
        
        
    }
}