import java.util.*;
class Sloution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int d,f=0,c=0;
        long m=n;
        while(n>0)
        {
             d=(int)n%10;
             f=d;
             c+=1;
             n/=10;
        }
        if(c==10 && f!=0)
        System.out.println("Valid");
        else
        System.out.println("Invalid");
    }
}