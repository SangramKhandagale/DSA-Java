import java.util.*;
import java.util.HashMap;;
public class Q5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:str.toCharArray()){
             if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
             }else{
                map.put(ch,1);
             }
        }
        System.out.println(map);
    }
}