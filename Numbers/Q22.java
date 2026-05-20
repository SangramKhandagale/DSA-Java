import java.util.*;
public class Q22{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  

        while(n>=10){
            int sum=0;
            while(n!=0){
                sum=sum+(n%10);
                n=n/10;
            }
            n=sum;
        }

        System.out.println(n);
    }
}