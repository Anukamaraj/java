import java.util.*;
public class Rupee
{
    public static void main(String[] args)
    {
        System.out.println("enter");
        Scanner s=new Scanner(System.in);

        int rupee=s.nextInt();
        double usd=rupee*0.012;
        System.out.println("usd"+usd);
    }
}