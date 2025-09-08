import java.util.*;
public class Q9{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean result=result(n);
        System.out.println(result);
       int sum=0;
    }

    public static boolean result(int n){
        int original=n;
        int sum=0;
        boolean result=false;
        while(n>0){
          int digit=n%10; 
          sum=sum+factorial(digit);
          n=n/10; 
        }
        if(original==sum){
             result=true;
        }
        return result;
    }

public static int factorial(int digit){
    int factorial=1;
        for(int i=1;i<=digit;i++){
            factorial=factorial*i;
        }
        return factorial;
}
}