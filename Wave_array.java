import java.util.*;
class wave
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        scan.close();
        int c=0;
        if(arr[0]<arr[1])
        {
            for(int i=1;i<a;i+=2)
            {
                if(arr[i-1]<arr[i])
                {
                    c=1;
                }
                else
                {
                    c=0;
                    break;
                }
            }
            if(c==0)
            {
                System.out.print("no");
            }
            else
            {
                System.out.print("yes");
            }
        }
        else
        {
            {
            for(int i=1;i<a;i+=2)
            {
                if(arr[i-1]>arr[i])
                {
                    c=1;
                }
                else
                {
                    c=0;
                    break;
                }
            }
            if(c==0)
            {
                System.out.print("no");
            }
            else
            {
                System.out.print("yes");
            }
        }
    }
    }
}
