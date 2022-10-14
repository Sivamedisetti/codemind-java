import java.util.*;
class average
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
       int m=arr[0];
        scan.close();
        
        for(int i=0;i<a;i++)
        {
            if(arr[i]>m)
            m=arr[i];
        }
        
        System.out.print(m);
    }
        
}