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
        int k=scan.nextInt();
        scan.close();
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]==k)
            {
                c=1;
            }
        }
        if(c==1)
        System.out.print("True");
        else
        System.out.print("False");
    }
}