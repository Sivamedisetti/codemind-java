import java.util.*;
class java
{
    static int factorial(int n)
    {
        int c=1;
        if(n==1)
            return 1;
        for(int i=1;i<=n;i++)
        {
            c*=i;
        }
        return c;
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int c = a;
        int s=0;
        while(c!=0)
        {
            int i = c%10;
            c=c/10;
            s+=factorial(i);
        }
        if(s==a)
            System.out.print("The number "+a+" is a strong number");
        else
            System.out.print("The number "+a+" is not a strong number");
    }
}