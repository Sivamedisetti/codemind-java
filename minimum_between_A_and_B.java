import java.util.*;
class Solution
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        List<Integer>list=new ArrayList<>();
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int d=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]>=b && arr[i]<=c)
            {
                list.add(arr[i]);
                d=1;
            }
        }
        if(d==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(Collections.min(list));
        }
    }
}