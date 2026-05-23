import java.util.*;
public class Q17{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<str1.length();i++){
          map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        }

         for(int i=0;i<str2.length();i++){
          map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }

         boolean result=false;

       if(map1.equals(map2)){
        System.out.println("Anagram");
       }else{
        System.out.println("Nope");
       }
    }
}