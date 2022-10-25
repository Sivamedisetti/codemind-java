import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=scan.nextInt();
            int c=b,s=0;
            while(c!=0)
            {
                int j=c%10;
                s = s*10+j;
                c = c/10;
            }
            if(s==b)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}