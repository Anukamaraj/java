import java.util.*;
public class mark
{
    public static void main(String args[])
    {
        System.out.println("enter the mark");
        Scanner s=new Scanner(System.in);
        int mark=s.nextInt();
        String grade=ma(mark);
        System.out.println(grade);
    }
    public static String ma(int mark)
    {
        String grade;
        if(mark>90)
        {
             grade="AA";
        }
        else if(mark>81)
        {
            grade ="AB";
        }
        else if(mark>71)
        {
             grade="BB";
        
        }
        else if(mark>61)
        {
             grade="BC";
        }
        else if(mark>51)
        {
            grade="CD";
        }
        else{
             grade="fail";
        }
        return grade;
    }
}