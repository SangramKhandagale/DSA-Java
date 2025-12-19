package Hashing.Medium;
import java.util.*;

public class Q9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        System.out.println("Frequencies: " + map);

        HashSet<Integer> usedFreq = new HashSet<>();
        int deletion = 0;

        for(Map.Entry<Character, Integer> e : map.entrySet()){
            int freq = e.getValue();

            while(freq > 0 && usedFreq.contains(freq)){
                freq--;
                deletion++;
            }

            if(freq > 0) usedFreq.add(freq);
        }

        System.out.println("Minimum deletions: " + deletion);
    }
}
