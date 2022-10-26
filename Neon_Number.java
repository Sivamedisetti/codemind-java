import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int c = s*s,d=0;
        while(c!=0)
        {
            int i=c%10;
            d+=i;
            c=c/10;
        }
        if(d==s)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}