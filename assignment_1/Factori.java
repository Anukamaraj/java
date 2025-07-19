

import java.util.Scanner;

public class Factori {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
       int fact1= factorial(num);
       System.out.println("the factorial of given number is"+fact1);

    }
     public static int factorial(int n)
    {
        if(n==1 ||n==0)
        {
            int fact = 1;
            return fact;

        }
        int fact=n*factorial(n-1);
                return fact;

    }
}
