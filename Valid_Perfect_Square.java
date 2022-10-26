import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0;i<a;i++)
        {
            int b = scan.nextInt();
            int c=1,d=0;
            while(b!=0)
            {
                if(c>b)
                {
                    d=1;
                    break;
                }
                if(c*c==b)
                {
                    System.out.println("True");
                    break;
                }
                c++;
            }
            if(d==1)
            {
                System.out.println("False");
            }
        }
        
    }
}