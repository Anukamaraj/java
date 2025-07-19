import java.util.*;
public class productt
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int a=d.nextInt();
        int b=d.nextInt();
       int c= product(a,b);
       System.out.println(c);
    }
    public static int product(int a,int b)
    {

        int c=a*b;
        return c;
    }
}