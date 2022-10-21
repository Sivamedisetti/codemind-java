import java.util.*;
class Sloution
{
    static int rev(int n)
    {
        int s=0;
        while(n>0)
        {
            int i=n%10;
            s=s*10+i;
            n/=10;
        }
        return s;
    }
    static int pallindrome(int n)
    {
        int c=rev(n);
        c=c+n;
        if(rev(c)==c)
        {
            System.out.print(c);
            return 0;
        }
        return pallindrome(c);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pallindrome(n);
    }
}