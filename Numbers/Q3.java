import java.util.*;
public class Q3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       boolean result=prime(n);
       System.out.println(result);
    }

    public static boolean prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        boolean result=false;

        if(count==2){
           result=true;
        }

        return result;
    }
}