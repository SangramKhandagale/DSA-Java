package Hashing;
import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        // Track frequency
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            // if number is out of range → immediately false
            if(arr[i] < 1 || arr[i] > n){
                System.out.println(false);
                return;
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Check if all numbers 1..N appear exactly once
        for(int i=1; i<=n; i++){
            if(!map.containsKey(i) || map.get(i) != 1){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
