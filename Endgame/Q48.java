package Endgame;
import java.util.*;
public class Q48{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();

        int arr[]=new int[n];

        ArrayList<Integer> list=new ArrayList<>();
    
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }

    for(int i=0;i<=n-k;i++){
        int max=arr[i];
        for(int j=i;j<i+k;j++){
        max=Math.max(arr[j],max);
        }

        list.add(max);
    }

    System.out.println(list);

    }
}