package Heaps;
import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }

        while(pq.size()>1){
           int first=pq.poll();
           int second=pq.poll();

           if(first!=second){
            int diff=first-second;
           pq.add(diff);
           }
        }

        System.out.println(pq.peek());

    }
}