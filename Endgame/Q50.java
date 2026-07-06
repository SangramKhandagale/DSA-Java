package Endgame;
import java.util.*;

public class Q50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int arr[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int primary=0,secondary=0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
               if(i==j){
                primary=primary+arr[i][j];
               }
            }
        }

        int i=0,j=m-1;

        while(i!=n){
            secondary=secondary+arr[i][j];
            j--;
            i++;
        }

   if(n==1){
System.out.println(0);
   }else{
         int sum=Math.abs(primary-secondary);

        System.out.println(sum);
   }

    }
}