import java.util.*;

public class Q37 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;
        int prevSign = 0; // 1 = positive, -1 = negative

        for(int i = 0; i < n; i++) {

            if(arr[i] == 0)
                continue;

            int currSign = (arr[i] > 0) ? 1 : -1;

            if(count == 0) {
                count = 1;
                prevSign = currSign;
            }
            else if(currSign != prevSign) {
                count++;
                prevSign = currSign;
            }
        }

        System.out.println(count);
    }
}