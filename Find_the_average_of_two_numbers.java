import java.util.*;
class Avg
{
    public static void main(String[] args)
    {
        float a,b;
        float c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=(float)(a+b)/2;
        System.out.format("%.4f",c);
        
    }
}