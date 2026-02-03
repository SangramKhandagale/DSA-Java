package Heaps;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter K:");
        int k = in.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : arr) {
            pq.add(num);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("Kth Largest = " + pq.peek());
    }
}
