import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int key = in.nextInt();
        int left = 0, right = n - 1;
        int found = -1; // better than 0

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                found = mid;
                break; // ✅ stop searching once found
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (found != -1) {
            System.out.println("Element found at index: " + found);
        } else {
            System.out.println("Element not found!");
        }
    }
}
