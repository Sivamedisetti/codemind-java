import java.util.*;
class fdkvjlnd
{
    public static void main(String dsd[])
    {
        List<Integer> l = new ArrayList<>();
        List<Integer>l1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                l.add(i);
            }
        }
        for(int i=1;i<=b;i++)
        {
            if(b%i==0)
            {
                l1.add(i);
            }
        }
        l.retainAll(l1);
        int c=0;
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)>c)
            {
                c=l.get(i);
            }
        }
        System.out.print(c);
    }
}