import java.util.*;
class Solution{
    public  static void main(String[] args)
    {
        List<Integer> l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int []arr1=new int[a];
        int []arr2=new int[b];
        for(int i=0; i<a;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<b;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<a;i++)
        {
            c=0;
            for(int j=0;j<b;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    c=1;
                }
            }
            if(c==0)
            {
                System.out.print(arr1[i]+" ");
            }
        }
        for(int i=0;i<b;i++)
        {
            c=0;
            for(int j=0;j<a;j++)
            {
               if(arr1[j]==arr2[i])
               {
                   c=1;
               }
            }
            if(c==0)
            {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}