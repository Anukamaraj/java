import java.util.*;
public class Fibo
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the no of series to find fibonacci");
        int num=ob.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=num)
        {
         int Temp=b;
          b=a+b;
         a=Temp;
         count++;
         System.out.println(b);
        }
//System.out.println("fibonacci series"+b);
    }
}
//fibonacci series