import java.util.*;
public class Summ
{
    public static void main(String args[])
    {
        Scanner e=new Scanner(System.in);
        System.out.println("enter number to find sum ");
        int n=e.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
          sum=sum+i;
        } System.out.println(sum);
    }
} 
// sum of n numbers 