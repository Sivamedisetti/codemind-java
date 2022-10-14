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
        for(int i=1;i<a-1;i++)
        {
            if((arr[i-1]%2==0 && arr[i+1]%2==1) || (arr[i-1]%2==1 && arr[i+1]%2==0))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}