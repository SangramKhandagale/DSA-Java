package Endgame;
import java.util.*;
public class Q59{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int max=0;

        for(int i=0;i<n;i++){
            
            int min=arr[i];

            for(int j=i;j<n;j++){
               min=Math.min(arr[j],min);

                int count=min*(j-i+1);

                max=Math.max(max, count);
            }
        }
System.out.println(max);
    }
}