import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        for(int i=n;i<=m;i++)
        {
            int r=i%10;
            if(r==2 || r==3 ||r==9)
            {
                c+=1;
            }
        }
        System.out.println(c);
       
    }
    }
}