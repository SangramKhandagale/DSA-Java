import java.util.*;

public class Q39 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();

        int max_sum = Integer.MIN_VALUE;
        int start = 0;

        for(int i = 0; i <= n - k; i++) {

            int sum = 0;

            for(int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if(sum > max_sum) {
                max_sum = sum;
                start = i + 1; 
            }
        }

        System.out.println(max_sum);
        System.out.println(start);
    }
}