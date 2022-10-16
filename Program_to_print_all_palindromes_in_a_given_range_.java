import java.util.*;
class swl
{
   
    static int is_palindrome(int m)
    {
        int a = m;
        int s=0,b;
        while(m!=0)
        {
            b=m%10;
            s=s*10+b;
            m=m/10;
        }
        if(a==s)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        for(int i=n;i<=m;i++)
        {
            if(is_palindrome(i)==1)
                {
                    System.out.print(i+" ");
                }
        }
        
    }
}