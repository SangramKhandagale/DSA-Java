import java.util.*;

public class Q47 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int k = in.nextInt();

        int low = 0;
        int high = n - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == k) {
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println(-1);
    }
}