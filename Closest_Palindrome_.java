import java.util.*;
class Sloution
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
    public static void main(String[] args)
    {
        int x=0,y=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(is_palindrome(i)==1)
            {
               x=i; 
            }
            
        }
         int i=n+1;
        while(true)
        {
           if(is_palindrome(i)==1)
           {
               y=i;
               break;
           }
           i++;
        }
    int a=Math.abs(x-n);
    int b=Math.abs(y-n);
    if(a==b)
    System.out.println(x+" "+y);
    else
    System.out.println(x);
    }
}