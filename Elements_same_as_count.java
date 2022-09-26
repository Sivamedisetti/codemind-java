import java.util.*;
class Solution
{
       public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0,t=0;
        for(int i=0;i<n;i++)
        {
            c=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=-999;
                    c++;
                }
            }
            if(a[i]!=-999)
            {
                if(c==a[i])
                {
                System.out.print(a[i]+" ");
                t+=1;
                }
            }
        }
      
        if(t==0)
        {
            System.out.print("-1");
        }
        
    }
}