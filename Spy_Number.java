import java.util.*;
class Sloution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n,s=0,p=1;
        while(n>0)
        {
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        if(s==p)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}