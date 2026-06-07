import java.util.*;

public class Q45 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        k = k % n;

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        int left_shift = k;

        for(int i = 0; i < n; i++) {
            arr1[i] = arr[left_shift];
            left_shift = (left_shift + 1) % n;
        }

        int right_shift = n - k;

        for(int i = 0; i < n; i++) {
            arr2[i] = arr[right_shift];
            right_shift = (right_shift + 1) % n;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        boolean leftSorted = true;

        for(int i = 1; i < n; i++) {
            if(arr1[i] < arr1[i - 1]) {
                leftSorted = false;
                break;
            }
        }

        boolean rightSorted = true;

        for(int i = 1; i < n; i++) {
            if(arr2[i] < arr2[i - 1]) {
                rightSorted = false;
                break;
            }
        }

        System.out.println(leftSorted ? "YES" : "NO");
        System.out.println(rightSorted ? "YES" : "NO");
    }
}