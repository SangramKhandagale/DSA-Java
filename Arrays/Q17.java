import java.util.Scanner;
public class Q17 {
    public static int findMajorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Majority element is: " + findMajorityElement(arr));
    }
}
