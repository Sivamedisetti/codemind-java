import java.util.*;
class VIBGYOR
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        char s = scan.next().charAt(0);
        scan.close();
        if(s=='V'||s=='v')
        {
            System.out.print("Violet");
        }
        else if(s=='I'||s=='i')
        {
             System.out.print("Indigo");
        }
        else if(s=='B'||s=='b')
        {
             System.out.print("Blue");
        }
        else if(s=='G'||s=='g')
        {
             System.out.print("Green");
        }
        else if(s=='Y'||s=='y')
        {
             System.out.print("Yellow");
        }
        else if(s=='O'||s=='o')
        {
             System.out.print("Orange");
        }
        else if(s=='R'||s=='r')
        {
             System.out.print("Red");
        }
        else
        {
             System.out.print("-1");
        }
    }
}
