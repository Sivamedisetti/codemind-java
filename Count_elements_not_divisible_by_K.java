import java.util.*;
class solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            {
                c+=1;
            }
        }
        System.out.print(c);
        
    }
}