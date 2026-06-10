import java.util.*;

public class Q42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        Stack<Character> stack = new Stack<>();
        int removal = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(!stack.isEmpty() && ch == stack.peek()) {
                stack.pop();
                removal++;
            }
            else {
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        for(char c : stack) {
            ans.append(c);
        }

        if(ans.length() == 0) {
            System.out.println("EMPTY CARAVAN");
        }
        else {
            System.out.println(ans);
        }

        System.out.println(removal);
    }
}