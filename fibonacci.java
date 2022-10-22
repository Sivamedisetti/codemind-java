import java.util.*;
class  Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        int c=a+b;
         System.out.print(a+" "+b+" ");
       for(int i=0;i<n-2;i++)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            
        }
    }
}