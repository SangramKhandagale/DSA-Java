package Heaps;
import java.util.*;
public class Q2{
    public static void main(String args[]){
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

        int target=in.nextInt();

       for(int i=0;i<target-1;i++){
       pq.poll();
       }

       System.out.println("Kth Largest:"+pq.peek());
       
    }
}