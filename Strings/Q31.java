import java.util.*;

public class Q31 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int i = 0;
        int j = 0;

        while (i < str1.length() && j < str2.length()) {

            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if (i == str1.length()) {
            System.out.println("Subsequence");
        } else {
            System.out.println("Nope");
        }
    }
}