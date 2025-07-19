 import java.util.Scanner;
 public class simple
 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int p=input.nextInt();
        int t=input.nextInt();
        int r=input.nextInt();
        int simple_interest=(p*t*r)/100;
        System.out.println(simple_interest);
    }
 }