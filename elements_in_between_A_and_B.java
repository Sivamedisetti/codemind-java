import java.util.*;
class sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a&&arr[i]<=b)
            {
                System.out.print(arr[i]+" ");
                c=1;
            }
        }
        if( c==0)
        {
            System.out.print("-1");
        }
    }
}