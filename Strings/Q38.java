import java.util.*;

public class Q38 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        String S = in.nextLine();
        String T = in.nextLine();

        int n = S.length();
        int m = T.length();

        int dp[][] = new int[n + 1][m + 1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {

                if(S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}