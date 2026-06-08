import java.util.*;

public class Q49 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = in.next();

            char arr[] = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(i + 1); // 1-indexed position
        }

        int totalGroups = map.size();

        int largestSize = 0;

        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

        for (ArrayList<Integer> group : map.values()) {
            groups.add(group);

            if (group.size() > largestSize) {
                largestSize = group.size();
            }
        }

        int countLargest = 0;

        for (ArrayList<Integer> group : groups) {
            if (group.size() == largestSize) {
                countLargest++;
            }
        }

        groups.sort((a, b) -> a.get(0) - b.get(0));

        System.out.println(totalGroups);
        System.out.println(largestSize);
        System.out.println(countLargest);

        for (ArrayList<Integer> group : groups) {
            for (int idx : group) {
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
}