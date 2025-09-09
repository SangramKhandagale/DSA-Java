import java.util.*;
public class Q10{
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    boolean result=result(n);
    System.out.println(result);
    }

   public static boolean result(int n){
    boolean result=false;
   int square=n*n;
   int digit=String.valueOf(n).length();
   int mod=(int)Math.pow(10, digit);
int original=square%mod;
    if(n==original){
        result=true;
    }
    return result;
   }
}

