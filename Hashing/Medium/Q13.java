import java.util.*;

public class Q13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String pattern = in.next();
        in.nextLine();
        String s = in.nextLine();

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            System.out.println(false);
            return;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (map1.get(ch) != null && !map1.get(ch).equals(word)) {
                System.out.println(false);
                return;
            }

            if (map2.get(word) != null && map2.get(word) != ch) {
                System.out.println(false);
                return;
            }

            map1.put(ch, word);
            map2.put(word, ch);
        }

        System.out.println(true);
    }
}
