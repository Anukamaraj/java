import java.util.*;
public class Sum_fun
{
    public static void main(String args[])
    {
        System.out.println("enter the number");
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        sum(n);
    }
    public static void sum(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }System.out.println(sum);
    }
}