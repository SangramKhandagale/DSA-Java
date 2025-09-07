import java.util.*;
public class Q7{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean result=armstrong(n);
        System.out.println(result);
    }

    public static boolean armstrong(int n){
        int original=n;
        boolean result=false;
        int digits=String.valueOf(n).length();
        int sum=0;
    while (n>0) {
        int digit=n%10;
        sum=sum+(int)Math.pow(digit,digits);
        n=n/10;
    }

    if(original==sum){
        result=true;
    }

    return result;
}
}