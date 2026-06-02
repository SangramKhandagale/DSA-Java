import java.util.*;

public class Q33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = 1;
        int length = 1;

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++) {

            int count = 1;

            for(int j = i; j < n - 1; j++) {

                if(arr[j] < arr[j + 1]) {
                    count++;
                } else {
                    break;
                }
            }

            if(count > length) {
                length = count;
                start = i + 1; // 1-indexed position
            }
        }

        System.out.println("Start: " + start + ", Length: " + length);

        in.close();
    }
}