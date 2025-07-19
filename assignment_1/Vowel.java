import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the alphabet");
        char v=a.next().toLowerCase().charAt(0);
        if(v.equals("a")||v.equals("e")||v.equals("i")||v.equals("o")||v.equals("u"))
        {
            System.out.println("The given alphabet is vowel");
        }
        else{
            System.out.println("the given alphabet is consonant");
        }
    }
}