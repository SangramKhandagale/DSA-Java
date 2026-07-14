package Endgame;
import java.util.*;

public class Q57 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int ans = Integer.MAX_VALUE;

        int maxVans = (n + 99) / 100;

        for(int vans = 0; vans <= maxVans; vans++) {

            int covered = vans * 100;

            int remaining = Math.max(0, n - covered);

            int cars = (remaining + 3) / 4;

            int pollution = vans * y + cars * x;

            ans = Math.min(ans, pollution);
        }

        System.out.println(ans);
    }
}