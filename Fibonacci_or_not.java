import java.util.*;
class Sloution
{
    static int fibi(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int a=0,b=1,i=0;
        int c = a+b;
        while(c<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if(c==n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(fibi(n)==1)
        {
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}