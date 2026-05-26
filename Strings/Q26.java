import java.util.*;

public class Q26 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String new_str = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                continue;
            } 
            else {
                new_str = new_str + str.charAt(i);
            }
        }

        int j = 0;
        int k = new_str.length() - 1;

        int count = 0;

        while (j < k) {

            if (new_str.charAt(j) != new_str.charAt(k)) {
                count = -1;
                break;
            }

            j++;
            k--;
        }

        if (count == -1) {
            System.out.println("Nope");
        } 
        else {
            System.out.println("Yes");
        }
    }
}