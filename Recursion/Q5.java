package Recursion;
import java.util.*;
class Q5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       Q5 sol=new Q5();
       int result=sol.fact(n);
       System.out.println(result);
    }

    public int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}