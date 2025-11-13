import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        

        boolean result = false;
        int duplicate = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > 1) {
                    result = true;
                    duplicate = arr[i];
                    break;
                }
            }
            if (result) break; // 💡 stop outer loop too
        }

        System.out.println(result);
        System.out.println(duplicate);
    }
}
