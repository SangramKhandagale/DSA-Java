import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

    // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Enter k:");
        int k = in.nextInt();

        // Step 2: Convert map into list of entries
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort list by frequency (descending)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Step 4: Take top K
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && i < list.size(); i++) {
            result.add(list.get(i).getKey());
        }

        System.out.println("Top " + k + " frequent elements: " + result);
    }
}
