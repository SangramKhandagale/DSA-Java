import java.util.*;

public class Q36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String P = sc.nextLine();

        int n = S.length();
        int m = P.length();

        boolean decoded = true;

        // Case 1: P is longer than S
        if (m > n) {
            for (int i = 0; i < n; i++) {
                if (S.charAt(i) != P.charAt(i)) {
                    decoded = false;
                    break;
                }
            }
        }
        // Case 2: P is shorter than or equal to S
        else {
            for (int i = 0; i < n; i++) {
                if (S.charAt(i) != P.charAt(i % m)) {
                    decoded = false;
                    break;
                }
            }
        }

        System.out.println(decoded ? "DECODED" : "FORGED");

        sc.close();
    }
}