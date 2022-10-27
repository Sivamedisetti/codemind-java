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
        int b = scan.nextInt();
        int s=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]<=b)
                s+=1;
            else
                s+=2;
                
        }
        System.out.println(s);
    }
}