import java.util.*;
public class Factor
{
    public static void main(String[] args)
    {
        System.out.println("enter the number");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for (int i=1;i<=n;i++)
      {
        if(n%i==0)
        {
            System.out.println(i);
        }
      }

    }
}
// input a number and print all the factors of that number