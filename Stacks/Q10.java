package Stacks;
import java.util.*;
public class Q10{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<n-1;i++){
  int count=1;

  for(int j=i-1;j>=0;j--){
    if(arr[j]<=arr[i]){
        count++;
    }else{
        break;
    }
  }

  System.out.print(count+" ");
        }
    }
}