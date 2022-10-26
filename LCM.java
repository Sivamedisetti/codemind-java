import java.util.*;
class Sloution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n<m)
        {
            int temp=n;
            n=m;
            m=temp;
        }
        int i=n; 
        while(n>0)
        {
            if(i%n==0 && i%m==0)
            {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}