package Heaps;
import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }

        int target=in.nextInt();

       for(int i=0;i<target-1;i++){
       pq.poll();
       }

       System.out.println("Kth Smallest:"+pq.peek());
       
    }
}