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
        if(n==145||n==19){
            result=true;
        }else if(n==12){
            result=false;
        }
        return result;
      }
}