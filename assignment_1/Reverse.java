 import java.util.*;
 public class Reverse
{
    public static void main(String[] args)
    {
        System.out.println("enter the numbers to reverse");
        Scanner in=new Scanner(System.in);
         int num=in.nextInt();
        int ans=0;
        while(num>0)
        {
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;


        }System.out.println(ans);

    }}