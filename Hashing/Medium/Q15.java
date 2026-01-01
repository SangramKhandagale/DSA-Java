package Hashing.Medium;
import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        // Step 1: store last index of each character
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        // Step 2: greedy partition
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        // Output
        System.out.println(result);
    }
}
