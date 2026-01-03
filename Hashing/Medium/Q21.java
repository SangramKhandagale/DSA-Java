package Hashing.Medium;
import java.util.*;
public class Q21{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int k=in.nextInt();

       
        int max_len=0;

        for(int i=0;i<n;i++){
            int sum=0;
            int count=0;
            for(int j=i;j<n;j++){
            sum=sum+arr[j];
            count=count+1;
            if(sum==0){
                int len=count;
              if(max_len<len){
                max_len=len;
              }
            }
            }
        }

        System.out.println(max_len);
    }
}