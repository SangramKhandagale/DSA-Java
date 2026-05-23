import java.util.*;
public class Q14{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine().toLowerCase();
        HashSet<Character> set=new HashSet<>();

        for(char c='a';c<='z';c++){
            set.add(c);
        }

       for(int i=0;i<str.length();i++){
        if(set.contains(str.charAt(i))){
            set.remove(str.charAt(i));
        }
       }

       if(set.isEmpty()){
            System.out.println("Pangram");
        }else{
            System.out.println("Nope");
        }
    }
}