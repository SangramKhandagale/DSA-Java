package Hashing.Medium;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();
        int count = 0;

        // NOOB LOGIC
        for(int i = 0; i < n; i++){
            int sum = 0;  // reset sum for new subarray start

            for(int j = i; j < n; j++){
                sum += arr[j];   // extend subarray

                if(sum % k == 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
