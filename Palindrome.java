import java.util.*;
class Solution
{
    public static boolean palindrome(int n)
    {
        int m=n,s=0,d;
        while(n>0)
        {
            d=n%10;
            s=s*10+d;
            n/=10;
        }
        if(s==m)
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(palindrome(n)==true)
        System.out.println("True");
        else
        System.out.println("False");
    }
}