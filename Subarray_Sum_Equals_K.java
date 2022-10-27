import java.util.*;
class Sloution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int s=0;
          for(int j=i;j<n;j++)
          {
              s+=arr[j];
              if(s==k)
              {
                  c++;
              }
              if(c>k)
              {
                  break;
              }
          }
        }
        System.out.println(c);
    }
}