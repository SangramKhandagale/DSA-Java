import java.util.*;

public class Q32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.nextLine();
        String T = in.nextLine();

        if(S.length() != T.length()) {
            System.out.println("DIFFERENT");
            return;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i = 0; i < S.length(); i++) {

            char c1 = S.charAt(i);
            char c2 = T.charAt(i);

            if(map1.containsKey(c1)) {
                if(map1.get(c1) != c2) {
                    System.out.println("DIFFERENT");
                    return;
                }
            }
            else {
                map1.put(c1, c2);
            }

            if(map2.containsKey(c2)) {
                if(map2.get(c2) != c1) {
                    System.out.println("DIFFERENT");
                    return;
                }
            }
            else {
                map2.put(c2, c1);
            }
        }

        System.out.println("MIRROR");
    }
}