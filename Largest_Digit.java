import java.util.*;
class Sloution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,d,m=0;
        while(n>0)
        {
            d=n%10;
            if(d>m)
            {
                m=d;
            }
            n/=10;
        }
        System.out.println(m);
    }
}