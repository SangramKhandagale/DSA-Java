import java.util.*;

public class Q51 {

    static int digitalRoot(String s) {

        while (s.length() > 1) {

            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }

            s = String.valueOf(sum);
        }

        return s.charAt(0) - '0';
    }

    static int digitalRoot(int num) {

        while (num >= 10) {

            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }

    static String addStrings(String a, String b) {

        StringBuilder ans = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            ans.append(sum % 10);
            carry = sum / 10;
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        String totalSum = addStrings(A, B);

        int drA = digitalRoot(A);
        int drB = digitalRoot(B);

        int product = drA * drB;

        int auspiciousProduct = digitalRoot(product);

        System.out.println(totalSum);
        System.out.println(auspiciousProduct);
    }
}