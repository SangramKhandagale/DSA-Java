import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
         int a=0,b=1;
         System.out.print("[");
        for(int i=1;i<=n;i++){
           System.out.print(a+",");
           int next=a+b;
           a=b;
           b=next;
        }
        System.out.print("]");

    }
}