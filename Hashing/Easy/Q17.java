package Hashing.Easy;
import java.util.*;

public class Q17{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        // Convert to list (your approach)
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }

        // To avoid counting same pair twice
        HashSet<String> set = new HashSet<>();

        int count = 0;

        for(int x : list){
            int y = target - x;

            if(list.contains(y)){
                // keep pair in sorted order to avoid duplicates
                int a = Math.min(x, y);
                int b = Math.max(x, y);

                String key = a + "#" + b;

                if(!set.contains(key)){
                    set.add(key);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
