package Endgame;
import java.util.*;
public class Q39{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();

for(int i=0;i<n;i++){
    if(arr[i]==0){
        arr[i]=-1;
    }
}

        map.put(0,-1);

        int sum=0;
        int maxLen=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            if(map.containsKey(sum)){
                maxLen=Math.max(maxLen, i-map.get(sum));
            }else{
                 map.put(sum,i);
            }

        }

        System.out.println(maxLen);

    }
}