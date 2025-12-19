package Hashing.Medium;
import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        System.out.println(map);

        int min_Value=Integer.MAX_VALUE;
        Character c = null;
        Character min_Key=c;
      
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()<min_Value){
                min_Value=e.getValue();
                min_Key=e.getKey();
            }
        }

        System.out.println(min_Key+" "+min_Value);

        int deletion=0;
        
        for(Map.Entry<Character, Integer> e:map.entrySet()){
        if(e.getValue()>min_Value){
            deletion=deletion+(e.getValue()-min_Value);
        }
        }

        System.out.println("Deletions:"+deletion);
    }
}