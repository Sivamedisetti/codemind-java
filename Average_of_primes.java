import java.util.*;
class Solution
{
    static int is_prime(int n)
    {
         if(n==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [n];
        float s=0,c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(is_prime(a[i])==1)
            {
                 s+=a[i];
                 c+=1;
            }
        }
        double avg=s/c;
        System.out.format("%.2f",avg);
    }
}