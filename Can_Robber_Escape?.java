import java.util.*;
class escape
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int s=0;
        for(int i=0;i<n;i++)
        {
            int a=scan.nextInt();
            if (a%2!=0)
            {
                s+=1;
            }
        }
        if(s<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}