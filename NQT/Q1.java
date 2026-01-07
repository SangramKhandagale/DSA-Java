package NQT;
import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                return;
            }
        }

        System.out.println(-1);
    }
}
