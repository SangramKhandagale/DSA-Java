package Stacks;
import java.util.*;
public class Q6{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int new_arr[]=new int[n];

        for(int i=n-1;i>=0;i--){
            int count=1;
            boolean found=false;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                break;
                }else{
                    count++;
                }
            }
            new_arr[i]=count;
         }

         for(int i=0;i<n;i++){
            System.out.println(new_arr[i]);
        }
    }
}