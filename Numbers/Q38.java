import java.util.*;
public class Q38{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=String.valueOf(n);
        int num=str.length();

        if(num%2==0){
          int r=num/2;
          int left=Integer.parseInt(str.substring(0, r));
          int right=Integer.parseInt(str.substring(r,str.length()));

          int sum=left+right;

          int sum1=sum*sum;

          if(sum1==n){
            System.out.println("Tech");
          }else{
            System.out.println("Nope");
          }
        }else{
            System.out.println("Nope");
        }
    }
}