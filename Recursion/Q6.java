package Recursion;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        // take input
        for (int k = 0; k < n; k++) {
            arr[k] = in.nextInt();
        }

        int i = 0;
        int j = n - 1;

        int arr2[] = Reverse(arr, i, j);

        // print reversed array
        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }

    public static int[] Reverse(int arr[], int i, int j) {

        if (i >= j) {
            return arr;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return Reverse(arr, i + 1, j - 1);
    }
}
