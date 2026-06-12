package Stacks;
import java.util.*;
public class Q11{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();

        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='['){
                set.add(str.charAt(i));
            }
        }

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='}'){
                set.remove('{');
            }else    if(str.charAt(i)==']'){
                set.remove('[');
            }else    if(str.charAt(i)==')'){
                set.remove('(');
            }
        }

        if(set.isEmpty()){
            System.out.println("Valid Parenthesis");
        }else{
            System.out.println("Is not");
        }

        
    }
}