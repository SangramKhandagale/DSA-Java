import java.util.*;
public class Q23{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < str.length(); i++){
            // if duplicate found → shrink window from left
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(start));  // remove leftmost char
                start++;                         // shrink window
            }

            set.add(str.charAt(i));  // add current char
            maxLen = Math.max(maxLen, i - start + 1);  // update max!
        }

        System.out.println(maxLen);
    }
}