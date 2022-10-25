import java.util.*;
class ddvsv
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a<0)
        {
            a=a*-1;
            int s=0;
            while(a!=0)
            {
                int v = a%10;
                s = s*10+v;
                a = a/10;
            }
            System.out.print(s);
        }
        else
        {
            int s=0;
            while(a!=0)
            {
                int v = a%10;
                s = s*10+v;
                a = a/10;
            }
            System.out.print(s);
        }
    }
}