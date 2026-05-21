import java.util.*;
public class Q29{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        if(isAutomorphic(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean isAutomorphic(int n){
        boolean result=false;

int sq=n*n;
String num=String.valueOf(n);
String square=String.valueOf(sq);
        return square.endsWith(num);
    }
}