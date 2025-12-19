import java.util.*;

public class MinWindow_Noob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();

        int minLen = Integer.MAX_VALUE;
        String ans = "";

        // frequency of t
        Map<Character, Integer> tMap = new HashMap<>();
        for(char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        // try all substrings
        for(int i = 0; i < s.length(); i++) {
            Map<Character, Integer> windowMap = new HashMap<>();

            for(int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

                if(isValid(windowMap, tMap)) {
                    int len = j - i + 1;
                    if(len < minLen) {
                        minLen = len;
                        ans = s.substring(i, j + 1);
                    }
                    break; // smallest for this i
                }
            }
        }

        System.out.println(ans);
    }

    static boolean isValid(Map<Character,Integer> win, Map<Character,Integer> t) {
        for(char c : t.keySet()) {
            if(win.getOrDefault(c, 0) < t.get(c)) {
                return false;
            }
        }
        return true;
    }
}
