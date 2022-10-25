import java.util.*;
class Sloution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<(int)Math.sqrt(n)+1;i++)
        {
            if(i*i==n)
            {
                System.out.println("True");
                c=1;
                break;
            }
        }
        if(c==0)
        System.out.println("False");
        
    }
}