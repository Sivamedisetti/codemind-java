import java.util.*;
class Oddeven
{
  public static void main(String assd[])
    {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                l1.add(arr[i]);
            }
            else
            {
                l2.add(arr[i]);
            }
        }
        int i=0,j=0;
        while(i<l1.size() || j<l2.size())
        {
            if(j<l2.size())
            {
                System.out.print(l2.get(j)+" ");
                j+=1;
            }
            if(i<l1.size())
            {
                System.out.print(l1.get(i)+" ");
                i+=1;
            }
        }
        if(n%2!=0)
        {
            System.out.print(0);
        }
    }
}