package Endgame;
import java.util.*;

public class Q38{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int new_arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
        int num=arr[i];
        boolean result=true;
        int j=i+1;  

        while(result && j<n){
        if(arr[j]>num){
            new_arr[i]=arr[j];
            result=false;
            break;
        }else{
            j++;
        }

        }

         if(result==true){
            new_arr[i]=-1;
        }

        }

           for(int i=0;i<n;i++){
           System.out.print(new_arr[i]+" ");
        }

    }
}