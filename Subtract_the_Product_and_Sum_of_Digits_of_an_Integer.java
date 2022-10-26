import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int c=0,d=1;
        while(a!=0)
        {
            int b = a%10;
            a = a/10;
            c+=b;
            d*=b;
        }
        System.out.print(d-c);
    }
}