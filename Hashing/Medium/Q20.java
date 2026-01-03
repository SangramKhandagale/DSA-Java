package Hashing.Medium;
import java.util.*;
public class Q20{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int k=in.nextInt();

        int count=0;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
            sum=sum+arr[j];

            if(sum==k){
                count++;
            }
            }
        }

        System.out.println(count);
    }
}