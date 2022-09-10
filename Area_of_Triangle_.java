import java.util.*;
class Area
{
    public static void main(String args[])
    {
        double a,b,c;
        double s;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(double)(a+b+c)/2;
       double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
        
    }
}