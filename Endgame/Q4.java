import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(i);
            }
            else {
                if (!stack.isEmpty()) {
                    char top = str.charAt(stack.peek());

                    if ((top == '(' && ch == ')') ||
                        (top == '[' && ch == ']') ||
                        (top == '{' && ch == '}')) {

                        stack.pop();
                    }
                    else {
                        remove[i] = true;
                    }
                }
                else {
                    remove[i] = true;
                }
            }
        }

        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }

        StringBuilder ans = new StringBuilder();
        int removals = 0;

        for (int i = 0; i < str.length(); i++) {
            if (remove[i]) {
                removals++;
            } else {
                ans.append(str.charAt(i));
            }
        }

        System.out.println(removals);
        System.out.println(ans.toString());
    }
}