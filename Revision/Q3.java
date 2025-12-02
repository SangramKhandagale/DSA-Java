package Revision;
import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        Print(n);
    }

    public static int Print(int n){
       
        if(n==0){
          return n;
        }else{
          
          System.out.println(n);
          Print(n-1);
        }
        return n;
    }
}
