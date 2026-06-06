import java.util.*;

public class Q39 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = in.next();

        HashMap<Integer, Long> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        int prefix = 0;

        long count = 0;

        int bestLen = 0;
        int bestStart = Integer.MAX_VALUE;

        freq.put(0, 1L);
        first.put(0, 0);

        for(int i = 1; i <= n; i++) {

            char ch = s.charAt(i - 1);

            if(ch == '1')
                prefix++;
            else
                prefix--;

            count += freq.getOrDefault(prefix, 0L);

            freq.put(prefix,
                    freq.getOrDefault(prefix, 0L) + 1);

            if(first.containsKey(prefix)) {

                int startIndex = first.get(prefix);
                int len = i - startIndex;

                int actualStart = startIndex + 1;

                if(len > bestLen ||
                  (len == bestLen &&
                   actualStart < bestStart)) {

                    bestLen = len;
                    bestStart = actualStart;
                }

            } else {
                first.put(prefix, i);
            }
        }

        if(count == 0) {
            System.out.println(0);
            System.out.println("NONE");
            System.out.println("NONE");
        } else {
            System.out.println(count);
            System.out.println(bestLen);
            System.out.println(bestStart);
        }
    }
}