import java.util.*;
class java
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
        if(a%2==0)
        {
            int i=0;
            for(i=0;i<a/2;i++)
            {
                System.out.print(arr[i]+" ");
                System.out.print(arr[a-i-1]+" ");
            }
            
        }
        else
        {
            int i=0;
            for(i=0;i<a/2;i++)
            {
                System.out.print(arr[i]+" ");
                System.out.print(arr[a-i-1]+" ");
            }
            System.out.print(arr[i]+" ");
            System.out.print("0");
        }
    }
}