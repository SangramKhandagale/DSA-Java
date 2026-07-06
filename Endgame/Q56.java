package Endgame;
import java.util.*;
public class Q56{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }


int i=0,step=0;

if(n==1 && arr[0]==0){
    System.out.println("Yes 0");
    step++;
}

boolean result=false;

        while(i<n){
        i=i+arr[i];
        
        if(i==n-1){
            System.out.println("Yes"+step);
            result=true;
        }

         step++;

        }

        if(result==false){
            System.out.println("No");
        }

    }
}