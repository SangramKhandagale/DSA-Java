import java.util.*;

public class Q19 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        boolean result = true;
        int i = 2;

        while(result && i * i <= n) {

            int j = 2;
            long res = (long)Math.pow(i, j);

            if(res == n) {
                result = false;
            }

            while(res <= n) {
                j++;
                res = (long)Math.pow(i, j);

                if(res == n) {
                    result = false;
                }
            }

            i++;
        }

        if(!result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}