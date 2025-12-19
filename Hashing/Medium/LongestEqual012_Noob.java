import java.util.*;

public class LongestEqual012_Noob {
    public static void main(String[] args) {

        int[] arr = {0,1,0,2,0,1,2};
        int n = arr.length;

        int maxLen = 0;

        // Fix starting index
        for(int i = 0; i < n; i++) {

            int c0 = 0, c1 = 0, c2 = 0;

            // Extend ending index
            for(int j = i; j < n; j++) {

                if(arr[j] == 0) c0++;
                else if(arr[j] == 1) c1++;
                else c2++;

                // Check condition
                if(c0 == c1 && c1 == c2) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        System.out.println(maxLen);
    }
}
