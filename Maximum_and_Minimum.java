import java.util.*;
class Solution
{
       public static void main(String args[])
    {
        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Boolean>set=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=0;
        for(int i=0;i<n;i++)
        {
            int c=1;
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
                list.add(a[i]);
                t+=1;
                }
                set.put(a[i],true);
            }
        }
      
        if(t==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(Collections.min(list)+" ");
            System.out.print(Collections.max(list)+" ");
            
        }
        
    }
}