import java.util.*;
public class Q30{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0,mul=1;
        while(n>0){
        int r=n%10;
        sum=sum+r;
        mul=mul*r;
        n=n/10;
        }

        if(sum==mul){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}