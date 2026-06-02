import java.util.*;
public class Q31{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

       String str=String.valueOf(n);

       String new_str=new StringBuilder(str).reverse().toString();

       int num=Integer.parseInt(new_str);

       if(n==num){
        System.out.println("Authentic");
       }else{
        System.out.println("Fake");
       }
    }
}