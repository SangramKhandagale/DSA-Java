import java.util.*;

public class Q42 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n < 3) {
            System.out.println("NO DEAL");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        long pref = 0;

        long[] minPref = new long[3];
        int[] minIdx = new int[3];

        Arrays.fill(minPref, Long.MAX_VALUE);

        minPref[0] = 0;
        minIdx[0] = 0;

        long bestSum = Long.MIN_VALUE;
        int bestStart = -1;
        int bestLen = -1;

        for (int i = 1; i <= n; i++) {

            pref += arr[i - 1];

            int rem = i % 3;

            if (minPref[rem] != Long.MAX_VALUE) {

                long currSum = pref - minPref[rem];
                int currLen = i - minIdx[rem];
                int currStart = minIdx[rem] + 1; // 1-indexed

                if (currLen >= 3) {

                    if (currSum > bestSum ||
                       (currSum == bestSum && currLen > bestLen) ||
                       (currSum == bestSum && currLen == bestLen
                                && currStart < bestStart)) {

                        bestSum = currSum;
                        bestLen = currLen;
                        bestStart = currStart;
                    }
                }
            }

            if (pref < minPref[rem]) {
                minPref[rem] = pref;
                minIdx[rem] = i;
            }
        }

        if (bestLen == -1) {
            System.out.println("NO DEAL");
        } else {
            System.out.println(bestSum);
            System.out.println(bestStart);
            System.out.println(bestLen);
        }
    }
}