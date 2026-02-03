package Heaps;
import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[][] = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        int k = in.nextInt();

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a,b) ->
                (b[0]*b[0] + b[1]*b[1]) -
                (a[0]*a[0] + a[1]*a[1])
            );

        for(int i=0; i<n; i++){

            pq.add(arr[i]);

            if(pq.size() > k){
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            int p[] = pq.poll();
            System.out.println("[" + p[0] + "," + p[1] + "]");
        }
    }
}
