package Endgame;
import java.util.*;

public class Q35{

    public static void Q35(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        int r = in.nextInt();

        if (r == 1 || r >= s.length()) {
            System.out.println(s);
            return;
        }

        StringBuilder[] rows = new StringBuilder[r];

        for (int i = 0; i < r; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;

        for (int i = 0; i < s.length(); i++) {

            rows[row].append(s.charAt(i));

            if (row == 0) {
                down = true;
            } else if (row == r - 1) {
                down = false;
            }

            if (down) {
                row++;
            } else {
                row--;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < r; i++) {
            ans.append(rows[i]);
        }

        System.out.println(ans);
    }
}