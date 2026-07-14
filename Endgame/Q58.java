package Endgame;
import java.util.*;

public class Q58 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),
                    map.getOrDefault(str.charAt(i), 0) + 1);
        }

        while(!map.isEmpty()){

            char minKey = Character.MAX_VALUE;
            int value = 0;

            for(Map.Entry<Character,Integer> e : map.entrySet()){

                if(e.getKey() < minKey){
                    minKey = e.getKey();
                    value = e.getValue();
                }
            }

            System.out.println(minKey + " " + value);

            map.remove(minKey);
        }
    }
}