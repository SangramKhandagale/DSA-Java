package Hashing;
import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        // Step 1: Create list of sorted words
        ArrayList<String> sortedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedList.add(sort(arr[i]));
        }

        System.out.println(sortedList);

        // Step 2: Start grouping
        ArrayList<ArrayList<String>> groups = new ArrayList<>();
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i]) continue;

            ArrayList<String> group = new ArrayList<>();
            group.add(arr[i]);
            visited[i] = true;

            for (int j = i + 1; j < n; j++) {
                if (!visited[j]) {
                    if (sortedList.get(i).equals(sortedList.get(j))) {
                        group.add(arr[j]);
                        visited[j] = true;
                    }
                }
            }

            groups.add(group);
        }

        System.out.println(groups);
    }

    public static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
