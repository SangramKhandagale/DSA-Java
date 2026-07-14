
package Endgame;
import java.util.*;

public class Q60 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {

            pq.add(arr[i]);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq.peek());
    }
}