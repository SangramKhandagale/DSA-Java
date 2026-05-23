import java.util.*;
public class Q20{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int count = 0;

        HashMap<Character,Character> map = new HashMap<>();

        if(str1.length() != str2.length()){
            System.out.println("NOT ISOMORPHIC");
        } else {
            for(int i = 0; i < str1.length(); i++){
                if(map.containsKey(str1.charAt(i))){
                    if(map.get(str1.charAt(i)) == str2.charAt(i)){
                        continue;
                    } else {
                        count = -1;
                        break;
                    }
                } else {
                    if(map.containsValue(str2.charAt(i))){  
                        count = -1;
                        break;
                    }
                    map.put(str1.charAt(i), str2.charAt(i));
                }
            }

            if(count == -1){
                System.out.println("NOT ISOMORPHIC");
            } else {
                System.out.println("ISOMORPHIC");
            }
        }
    }
}