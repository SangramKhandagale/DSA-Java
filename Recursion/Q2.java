package Recursion;
import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
          int m=0;
        Print(n,m);
    }

    public static int Print(int n,int m){
       
        if(n==0){
          return n;
        }else{
          
          System.out.println(m+1);
          Print(n-1,m+1);
        }
        return n;
    }
}
