import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=0,c=1,n=0;
        System.out.print("0 ");
        System.out.print("1 ");
        while(n<a-2)
        {
            int d=b+c;
            b=c;
            c=d;
            System.out.print(c+" ");
            n++;
        }
    }
}