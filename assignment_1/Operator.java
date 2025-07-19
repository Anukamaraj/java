import java.util.*;
public class Operator
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("enter the operator you want");
        int ans=0;
        String op = in.next();
        if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")||op.equals("%"))
        {
            if(op.equals("+"))
            {
             ans=a+b;
            }
            if(op.equals("-"))
            {
                ans=a-b;
            }
            if(op.equals("*"))
            {
                ans=a*b;
            }
            if(op.equals("/"))
            {
                ans=a/b;
            }
            if(op.equals("%"))
            {
                ans=a%b;
            }
        }else{
        System.out.println("invalid operator");
        }
        System.out.println(ans);
            
    }
}