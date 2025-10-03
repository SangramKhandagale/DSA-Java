import java.util.*;
public class Q27{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            minHeap.add(arr[i]);
        }

        int k=in.nextInt();

        for(int i=1;i<k;i++){
            minHeap.poll();
        }

        System.out.println(minHeap.poll());
    }
}