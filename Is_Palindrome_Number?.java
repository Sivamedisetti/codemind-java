import java.util.*;
class Solution
{
    static int palindrome(int n)
    {
        int a=n,s=0,r;
            while(n!=0)
            {
                r=n%10;
                s=s*10+r;
                n=n/10;
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
        
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(palindrome(n)==1)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
        
    }
}