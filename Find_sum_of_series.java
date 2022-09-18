import java.util.*;
class Series
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float s=0;
        for(float i=1;i<=a;i++)
        {
            s=s+(1/i);
        }
        System.out.format("%.2f",s);
    }
}