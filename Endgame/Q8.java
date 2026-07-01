import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            n /= 10;

            // Check positive overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(0);
                return;
            }

            // Check negative overflow
            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println(0);
                return;
            }

            rev = rev * 10 + digit;
        }

        System.out.println(rev);
    }
}