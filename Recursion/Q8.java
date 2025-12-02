package Recursion;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibSeries(n);
    }

    public static void fibSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibb(i) + " ");
        }
    }
    public static int fibb(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibb(n - 1) + fibb(n - 2);
    }
}
