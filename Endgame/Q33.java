package Endgame;

import java.util.*;

public class Q33 {

    static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String str = in.next().toUpperCase();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            int curr = value(str.charAt(i));

            if (i + 1 < str.length()) {
                int next = value(str.charAt(i + 1));

                if (curr < next) {
                    sum += (next - curr);
                    i++; // skip next character
                } else {
                    sum += curr;
                }
            } else {
                sum += curr;
            }
        }

        System.out.println(sum);
    }
}