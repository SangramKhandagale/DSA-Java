package Endgame;
import java.util.*;
public class Q37{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int j=0;j<k;j++){
            int num=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }

            arr[n-1]=num;
        }

           for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }
        

    }
}