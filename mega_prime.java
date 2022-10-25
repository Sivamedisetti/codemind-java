import java.util.*;
class java
{
    static int is_prime(int n)
    {
        if(n==1)
            return 0;
        for(int i=2;i<(int)Math.sqrt(n)+1;i++)
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
        int c=0,s=0;
        if(is_prime(a)==1)
        {
            while(a!=0)
            {
                int i = a%10;
                a = a/10;
                c++;
                if(is_prime(i)==1)
                {
                    s++;
                }
            }
            if(s==c)
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
}