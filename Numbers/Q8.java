import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean result=result(n);
        System.out.println(result);
    }

    public static boolean result(int n){
        boolean result=false;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            result=true;
        }
        return result;
    }
}