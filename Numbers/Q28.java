import java.util.*;
public class Q28{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(Kaprekar(n)){
            System.out.println("Kaprekar");
        }else{
            System.out.println("Not Kaprekar");
        }
    }

    public static boolean Kaprekar(int n){
        boolean result=false;

         int sq=n*n;
         String str=String.valueOf(sq);
         int left=0;
         int right=0;
      
         for(int i=0;i<str.length()/2;i++){
            left=left*10+(str.charAt(i)-'0');
         }

         for(int i=str.length()/2;i<str.length();i++){
            right=right*10+(str.charAt(i)-'0');
         }

         int sum=left+right;

         if(sum==n){
            result=true;
         }


        return result;
    }
}