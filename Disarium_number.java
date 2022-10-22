import java.util.*;
class Sloution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,i=1,d,m=n;
        int p=(int)Math.log10(n);
        while(n>0)
        {
            d=n/(int)Math.pow(10,p);
            int x=(int)Math.pow(d,i);
            s+=x;
            n=n%(int)Math.pow(10,p);
            i++;
            p-=1;
        }
        if(s==m)
        System.out.println("True");
        else
        System.out.println("False");
    }
}