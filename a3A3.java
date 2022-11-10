import java.io.*;
import java.util.*;
interface operation
{
    void area();
    void volume();
}
class a3A3 implements operation
{
    int r,h;
    double PI=3.142;
    double area,v;
     
    public void area()
    {
        area=2*PI*r*(r+h);
        System.out.println("area="+area);
    }
    public void volume()
    {
        v=PI*r*r*h;
        System.out.println("volume="+v);
    }

    public static void main(String args[])
    {
       int r,h;
       Scanner sc=new Scanner(System.in);
       a3A3 obj=new a3A3();
        System.out.println("enter r:");
        r=sc.nextInt();
        System.out.println("enter h:");
        h=sc.nextInt();
        
        obj.area();
        obj.volume();
    }
}