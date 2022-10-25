import java.util.*;
class java
{
    static int is_prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        for(int i=2;i<Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(is_prime(a)==1)
        {
            int s=0;
            while(a!=0)
            {
                int i=a%10;
                s=s*10+i;
                a=a/10;
            }
            if(is_prime(s)==1)
            {
                System.out.println("circular prime");
            }
            else
            {
                System.out.println("prime but not a circular prime");
            }
        }
        else
        {
            System.out.println("not prime");
        }
        
    }
}