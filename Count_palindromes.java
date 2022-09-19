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
        int c=0;
        int []arry=new int[n];
        for(int i=0;i<n;i++)
        {
            arry[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(palindrome(arry[i])==1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    }