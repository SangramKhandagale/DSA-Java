package Hashing.Easy;
import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        boolean result = true;  

        for(char ch : map1.keySet()){
            int f1 = map1.get(ch);
            int f2 = map2.getOrDefault(ch, 0);

            if(f1 > f2){      
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
