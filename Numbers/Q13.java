import java.util.*;
public class Q13{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean result=result(n);
        System.out.println(result);

    }

    public static boolean result(int n){
        boolean result=false;
        if(n>0 && (n &(n-1))==0){
            result=true;
        }
        return result;
    }
}