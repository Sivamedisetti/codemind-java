import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int c=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c+=i;
            }
        }
        if(c==a)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}