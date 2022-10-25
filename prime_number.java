import java.util.*;
class Sloution
{
    static int prime(int n)
    {
        if(n==1)
        return 1;
        else
        {
            for(int i=2;i<(int)Math.sqrt(n)+1;i++)
            {
                if(n%i==0)
                return 0;
            }
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n)==1)
        {
            System.out.println("prime");
        }
         else
        {
            System.out.println("not a prime");
        }
    }
}