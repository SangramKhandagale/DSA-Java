import java.util.*;

public class Q34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int first = -1;
        int second = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] != i + 1) {

                if(first == -1)
                    first = arr[i];
                else
                    second = arr[i];
            }
        }

        int a = Math.min(first, second);
        int b = Math.max(first, second);

        System.out.println(a + " " + b);

        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}