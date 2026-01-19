package Stacks;
import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int new_arr[]=new int[n];

        for(int i=0;i<n;i++){
            int count=0;
            boolean found=false;
            for(int j=i+1;j<n;j++){
                count++;
                if(arr[j]>arr[i]){
             found=true;
                break;
                }
         
            }

        if(found==true){
             new_arr[i]=count;
        }else{
             new_arr[i]=0;
        }
         }

         for(int i=0;i<n;i++){
            System.out.println(new_arr[i]);
        }
    }
}