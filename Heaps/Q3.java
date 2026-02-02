package Heaps;
import java.util.*;
public class Q3{
    public static void main(String[] args) {
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

        int cost=0;

        while(pq.size()!=1){
            int sum=0;

            for(int i=0;i<2;i++){
            sum=sum+pq.peek();
            pq.poll();
            }
            
            cost=cost+sum;
            pq.add(sum);

        }

        System.out.println(cost);

    }
}