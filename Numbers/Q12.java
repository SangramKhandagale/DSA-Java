import java.util.*;
public class Q12{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int LCM=result(a,b);
        System.out.println(LCM);
    }

    public static int result(int a,int b){
        int num=a*b;
        int den=GCD(a,b);
        int result=num/den;
        return result;
    }

    public static int GCD(int a,int b){
        while(b>0){
        int temp=b;
        b=a%b;
        a=temp;
        }

        return a;
    }
}