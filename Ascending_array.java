import java.util.*;
class Descending
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arry=new int[n];
        int a=1;
        for(int i=0;i<n;i++)
        {
            arry[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arry[i]<arry[i+1])
            {
                a=1;
            }
            else
            {
                a=0;
                break;
                
            }
        }
        if(a==1)
        System.out.print("yes");
        if(a==0)
        System.out.print("no");
    }
}