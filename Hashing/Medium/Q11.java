package Hashing.Medium;
import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            pq.add(e);
        }

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> curr = pq.poll();
            result.append(curr.getKey());
            curr.setValue(curr.getValue() - 1);

            if (prev != null && prev.getValue() > 0) {
                pq.add(prev);
            }

            prev = curr;
        }

        if (result.length() != str.length()) {
            System.out.println("");
        } else {
            System.out.println(result.toString());
        }
    }
}
