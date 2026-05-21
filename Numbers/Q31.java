import java.util.*;
public class Q31{
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sq=n*n;
        int sum=0;
        while(sq>0){
            int r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }

        if(sum==n){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }
    }

}