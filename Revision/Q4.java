package Revision;
import java.util.*;
public class Q4{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sum=0;
    int result=Add(n,sum);
    System.out.println(result);
    }

    public static int Add(int n,int sum){
    if(n==0){
        return sum;
    }else{
     sum=sum+n;
    
    }
   return Add(n - 1, sum);
    }
}