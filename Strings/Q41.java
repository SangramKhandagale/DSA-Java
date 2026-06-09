import java.util.*;

public class Q41 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int k = in.nextInt();

        k %= 26;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c >= 'A' && c <= 'Z') {
                c = (char)((c - 'A' + k) % 26 + 'A');
            }
            else if(c >= 'a' && c <= 'z') {
                c = (char)((c - 'a' + k) % 26 + 'a');
            }

            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}