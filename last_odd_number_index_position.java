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
        for(int i=1;i<a;i++)
        {
            if(arr[a-i]%2!=0)
            System.out.print(a-i);
            break;
        }
       
    }
}