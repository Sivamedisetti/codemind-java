import java.util.*;
class Solution
{
    public static void unique(int arr[],int n)
    {
        boolean vist[]= new boolean [n];
        Arrays.fill(vist,false);
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(vist[i]==true)
            continue;
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c+=1;
                    vist[j]=true;
                }
            }
            if(c==1)
            {
                System.out.print(arr[i]+" ");
                k=1;
            }
        } if(k==0)
            System.out.println(-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        unique(a,n);
        
    }
}