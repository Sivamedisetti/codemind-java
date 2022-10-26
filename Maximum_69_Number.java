import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        char ch[] = new char[a.length()];
        for(int i=0;i<a.length();i++)
        {
            ch[i]=a.charAt(i);
        }
        for(int i=0;i<a.length();i++)
        {
            if(ch[i]=='6')
            {
                ch[i]='9';
                break;
            }
        }
        for(int i=0;i<a.length();i++)
        {
            System.out.print(ch[i]);
        }
    }
}