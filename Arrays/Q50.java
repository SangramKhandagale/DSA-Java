import java.util.*;

public class Q50 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // PART 1: Longest subarray with all distinct elements

        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;
        int start = 1;

        for(int right = 0; right < n; right++) {

            map.put(arr[right],
                    map.getOrDefault(arr[right], 0) + 1);

            while(map.get(arr[right]) > 1) {

                map.put(arr[left],
                        map.get(arr[left]) - 1);

                if(map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }

            int len = right - left + 1;

            if(len > maxLen) {
                maxLen = len;
                start = left + 1; // 1-indexed
            }
        }

        // PART 2: Maximum distinct elements in any window of size K

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i = 0; i < k; i++) {
            freq.put(arr[i],
                     freq.getOrDefault(arr[i], 0) + 1);
        }

        int maxDistinct = freq.size();

        for(int i = k; i < n; i++) {

            int remove = arr[i - k];

            freq.put(remove, freq.get(remove) - 1);

            if(freq.get(remove) == 0) {
                freq.remove(remove);
            }

            freq.put(arr[i],
                     freq.getOrDefault(arr[i], 0) + 1);

            maxDistinct = Math.max(maxDistinct,
                                   freq.size());
        }

        System.out.println(maxLen);
        System.out.println(start);
        System.out.println(maxDistinct);
    }
}