import java.util.*;
class alnas
{
    public static int reverse(int n)
    {
        int s=0;
        while(n!=0)
        {
            int a = n%10;
            s = s*10+a;
            n = n/10;
        }
        return s;
    }
    public static void main(String assd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int c = a*a;
        int b = reverse(a);
        int e = b*b;
        int d=reverse(e);
        if(d==c)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}