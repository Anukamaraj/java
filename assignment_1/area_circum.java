import java.util.*;
public class area_circum
{
    public static void main(String args[])
    {
        System.out.println("enter the radius");
        Scanner s=new Scanner(System.in);
        float rad=s.nextInt();
        areacircum( rad);
    }
public static void areacircum( float rad)
  {
    double circum=2*3.14*rad;
    System.out.println(circum);
    double area=3.14*rad*rad;
    System.out.println(area);
  }
}