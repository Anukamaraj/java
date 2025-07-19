import java.util.*;
public class Occurence
{
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("enter the numbers");
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        while(n>0)
        {
            int reminder=n%10;
            if(reminder==3)
            {
                count=count+1;
            }
            n=n/10;
        }System.out.println(count);
    }
}
