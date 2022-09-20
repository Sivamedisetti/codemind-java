import java.util.*;
class Solution
{
    static int minimum(int n,int arr[])
    {
        int k=0;
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                k=i;
            }
        }
        return k;
    }
    static int maximum(int n,int arr[])
    {
        int k=0;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                k=i;
            }
        }
        return k;
    }
    static int is_prime(int n)
    {
         if(n==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x = minimum(n,arr);
        int y = maximum(n,arr);
        if(x<y)
        {
            for(int i=x;i<=y;i++)
            {
                if(is_prime(arr[i])==1)
                {
                    c++;
                }
            }
        }
        else
        {
            for(int i=y;i<=x;i++)
            {
                if(is_prime(arr[i])==1)
                {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}