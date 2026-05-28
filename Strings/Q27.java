import java.util.*;
public class Q27{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();


              String new_str="";
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
            if(map.get(str.charAt(i))==1){
                new_str=new_str+str.charAt(i);
            }
        }

        System.out.println(new_str);
    }
}