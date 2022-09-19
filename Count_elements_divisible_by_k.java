import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        int []arry= new int[l];
        for(int i=0;i<l;i++)
        {
            arry[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(arry[i]%n==0)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}