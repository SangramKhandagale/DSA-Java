import java.util.*;

public class Q13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {

            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
                return;
            }

            map.put(arr[i], i);
        }
    }
}