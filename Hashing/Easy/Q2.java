package Hashing.Easy;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        // Step 2: Find max and min frequencies first
        for(int freq : map.values()){
            if(freq > maxFreq) maxFreq = freq;
            if(freq < minFreq) minFreq = freq;
        }

        // Step 3: Store all elements with max and min frequencies
        ArrayList<Integer> maxElements = new ArrayList<>();
        ArrayList<Integer> minElements = new ArrayList<>();

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == maxFreq) maxElements.add(e.getKey());
            if(e.getValue() == minFreq) minElements.add(e.getKey());
        }

        // Step 4: Print result
        System.out.println("Elements with maximum frequency: " + maxElements);
        System.out.println("Elements with minimum frequency: " + minElements);
    }
}
