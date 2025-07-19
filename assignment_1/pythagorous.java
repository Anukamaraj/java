import java.util.*;
public class pythagorous
{
    public static void  main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        int b=e.nextInt();
        int c=e.nextInt();
        pyth(a,b,c);
    }
    public static void pyth(int a,int b,int c)
    {
       int cc= c*c;
         int bb=b*b;
         int aa=a*a;
        if(cc==bb+aa)
        {
            System.out.println("the given number is pythagorean");
        }
        else
        {
            System.out.println("the given number is not a pythagorean");
        }
    }
}