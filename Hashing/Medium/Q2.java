import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int longest = 0;
        int startPoint = 0;  // store where the best sequence starts

        for (int num : arr) {
            // If this number is the START of a sequence
            if (!set.contains(num - 1)) {
                int curr = num;
                int len = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }

                if (len > longest) {
                    longest = len;
                    startPoint = num;
                }
            }
        }

        // Print length
        System.out.println("Length: " + longest);

        // Print sequence
        System.out.print("Sequence: ");
        for (int i = 0; i < longest; i++) {
            System.out.print((startPoint + i) + " ");
        }
    }
}
