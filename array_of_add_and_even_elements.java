import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        int x=0,y=0;
        int a[]=new int [100];
        int b[]=new int [100];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                a[x++]=arr[i];
            }
            else
            {
                b[y++]=arr[i];
            }
        }
        for(int i=0;i<y;i++)
        {
            System.out.print(b[i]+" ");
        }
        for(int i=0;i<x;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}