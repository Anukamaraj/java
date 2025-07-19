import java.util.*;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int original=n;
        int sum;
        while(n>0)
        {
          int digit=n%10;
          digit=(digit**3);
          int sum=sum+digit;
          n=n/10;


        }System.out.println(sum);
    }
}