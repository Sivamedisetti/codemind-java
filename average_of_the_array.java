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
        scan.close();
        int c=0;
        double d=0;
        for(int i=0;i<a;i++)
        {
            d+=arr[i];
        }
        double b = d/a;
        System.out.format("%.2f",b);
    }
        
}