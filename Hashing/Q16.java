import java.util.*;

public class Q16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Convert map to list (required for sorting)
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        // bubble sort (NOOB FRIENDLY)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {

                // swap if frequency is smaller
                if (list.get(i).getValue() < list.get(j).getValue()) {
                    Map.Entry<Integer,Integer> temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        // print sorted result in required format
        for (Map.Entry<Integer,Integer> e : list) {
            int val = e.getKey();
            int freq = e.getValue();

            for (int k = 0; k < freq; k++) {
                System.out.print(val + " ");
            }
        }
    }
}
