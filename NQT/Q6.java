package NQT;
import java.util.*;

public class Q6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        HashMap<Character,Integer> freq = new HashMap<>();
        HashMap<Character,Integer> FI = new HashMap<>();
        HashMap<Character,Integer> LI = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0) + 1);
        }

        for(int i = 0; i < str.length(); i++){
            if(!FI.containsKey(str.charAt(i))){
                FI.put(str.charAt(i), i);
            }
        }

        for(int i = str.length() - 1; i >= 0; i--){
            if(!LI.containsKey(str.charAt(i))){
                LI.put(str.charAt(i), i);
            }
        }

        int sum = 0, div = 0;
        for(Map.Entry<Character,Integer> e : freq.entrySet()){
            char key = e.getKey();
            if(FI.get(key) % 2 == 0){
                sum += e.getValue();
                div++;
            }
        }

        if(div == 0){
            System.out.println(-1);
            return;
        }

        double avg = (double) sum / div;
        int maxLast = -1;
        char ans = 0;

        for(Map.Entry<Character,Integer> e : freq.entrySet()){
            char key = e.getKey();
            int first = FI.get(key);
            int last = LI.get(key);
            int dis = last - first;

            if(e.getValue() >= 2 && isPrime(dis) && e.getValue() > avg){
                if(last > maxLast || (last == maxLast && key < ans)){
                    maxLast = last;
                    ans = key;
                }
            }
        }

        if(ans == 0){
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
