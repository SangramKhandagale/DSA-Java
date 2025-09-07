import java.util.*;
public class Q6{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int result=0;
        int res=0;
        while(n>0){
           res=n%10;
           n=n/10;
           result=result+res;
        }
        System.out.println(result);
    }
}