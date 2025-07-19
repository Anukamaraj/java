import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        System.out.println("enter number");
        int num=d.nextInt();
        fact(num);
    }
    static int fact(int n)
    {
        if( n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}