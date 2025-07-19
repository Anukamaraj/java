class Exam
{
   int l = 10;
    int m = 20;
    public void disp()
    {
       // int l=10;
        //int m=20;
        int ae=l*m;
        System.out.println(ae);
    }
} 
class rc extends Exam
{   
    
    int ws=l*m;
    public void dis(){
    System.out.println(ws);

    }
}
public class main
{
    public static void main(String args[])
    {
     rc d =new rc();
     d.dis();
}}