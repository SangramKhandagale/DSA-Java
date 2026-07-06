package Endgame;
import java.util.*;

public class Q44 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        in.nextLine();
        String str2 = in.nextLine();

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();

        int j = 0;
        String new_str = "";
        boolean result = true;

        str2 = str2 + " "; // process last word

        for (int i = 0; i < str2.length(); i++) {

            if (str2.charAt(i) != ' ') {
                new_str += str2.charAt(i);
            } else {

                if (j >= str1.length()) {
                    result = false;
                    break;
                }

                char ch = str1.charAt(j);

                if (map.containsKey(ch)) {

                    String str = map.get(ch);

                    if (!str.equals(new_str)) {
                        result = false;
                        break;
                    }

                } else {

                    if (usedWords.contains(new_str)) {
                        result = false;
                        break;
                    }

                    map.put(ch, new_str);
                    usedWords.add(new_str);
                }

                new_str = "";
                j++;
            }
        }

        if (j != str1.length()) {
            result = false;
        }

        if (result) {
            System.out.println("MATCH");
        } else {
            System.out.println("NO MATCH");
        }
    }
}