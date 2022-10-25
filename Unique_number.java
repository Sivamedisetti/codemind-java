import java.util.*;
class java
{
    public static void main(String asd[])
    {
        int c=0,a;
        Set<Integer> l1 = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        while(a!=0)
        {
            int i=a%10;
            a=a/10;
            l1.add(i);
            c++;
        }
        if(c==l1.size())
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}