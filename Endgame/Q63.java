package Endgame;
import java.util.*;
public class Q63{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int k=in.nextInt();

        int sum=0,count=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);

        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            if(map.containsKey(sum-k)){
                int start=map.get(sum-k)+1;
                int end=i;

                System.out.println(start+" "+end);
            }

            if(!map.containsKey(sum-k)){
                map.put(sum,i);
            }
        }
    }
}