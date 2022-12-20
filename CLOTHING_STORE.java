import java.util.*;
class Solution
{
   public static int countfrq(int arr[],int n)
   {
       boolean vist[]=new boolean[n];
       Arrays.fill(vist,false);
       int p=0;
       for(int i=0;i<n;i++)
       {
           if(vist[i] == true)
              continue;
              
           int c=1;
           for(int j=i+1;j<n;j++)
           {
               if(arr[i]==arr[j])
               {
                   vist[j]=true;
                   c++;
               }
           }
           p+=c/2;
       }
       return p;
   }
   public static void main(String argd[])
   {
       Scanner sc=new Scanner(System.in);
       
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       int sol=countfrq(a,n);
       System.out.println(sol);
    
       
   }
}