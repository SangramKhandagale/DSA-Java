import java.util.*;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found!");
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {
        // Base case → invalid range
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;  // found
        } else if (arr[mid] > key) {
            return binarySearch(arr, low, mid - 1, key);  // search left half
        } else {
            return binarySearch(arr, mid + 1, high, key); // search right half
        }
    }
}
