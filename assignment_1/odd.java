import java.util.*;
public class odd 
    {
        public static void main(String[] args)
        {
            System.out.println("enter the number");
            Scanner s=new Scanner(System.in);
            int num=s.nextInt();
            odds(num);
        }
        public static void odds(int num)
        {
            if(num%2==0)
            {
                System.out.println("the number is even");
            }
            else
             {
                System.out.println("the number is odd");
            }
        }
    }

