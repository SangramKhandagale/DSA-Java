import java.util.*;
 public class Q6{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char result=solve(str);
        System.out.println(result);
    }

    public static char solve(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(char c:str.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
         return '\0';
    }
 }