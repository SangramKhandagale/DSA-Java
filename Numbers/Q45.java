import java.util.*;

public class Q45 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long sum = 0;
        int count = 0;

        for(int i = 1; i <= n; i++) {

            int temp = i;
            int product = 1;

            while(temp > 0) {
                int r = temp % 10;
                product *= r;
                temp /= 10;
            }

            sum += product;

            if(product == 0) {
                count++;
            }
        }

        System.out.println(sum);
        System.out.println(count);
    }
}