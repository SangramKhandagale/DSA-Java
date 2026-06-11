import java.util.*;
public class Q50{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        int a1=a;
        int b1=b;

        while(b1!=0){
            int temp=b1;
            b1=a1%b1;
            a1=temp;
        }

        int gcd=a1;

        int lcm=(a*b)/gcd;

        int sum=a+b;

        int count=0;

        for(int i=2;i<=sum;i++){
         if(sum%i==0){
            count++;
         }
        }

        System.out.println(gcd+" "+lcm+" "+count);

    }
}