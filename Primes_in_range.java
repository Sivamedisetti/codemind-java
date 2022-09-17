import java.util.*;
class Solution
{
    static int is_prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        for(int i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(is_prime(i)==1)
                c++;
            
        }
        System.out.println(c);
        
    }
}