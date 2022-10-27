import java.util.*;
class Solutio {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i*i==n){
                System.out.print("True");
                c+=1;
                break;
            }
        }
        if(c==0){
        System.out.print("False");
      }
    }
}