package Hashing.Medium;
import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: frequency count
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        StringBuilder newstr = new StringBuilder();

        while (!map.isEmpty()) {

            char maxChar = 0;
            int maxFreq = 0;

          
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() > maxFreq ||
                   (e.getValue() == maxFreq && e.getKey() < maxChar)) {
                    maxChar = e.getKey();
                    maxFreq = e.getValue();
                }
            }

            for (int i = 0; i < maxFreq; i++) {
                newstr.append(maxChar);
            }

          
            map.remove(maxChar);
        }

        System.out.println(newstr.toString());
    }
}
