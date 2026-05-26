import java.util.*;
public class Q24{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
       
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                set.add(str.charAt(i));
            }

             if(str.charAt(i)==')'){
                set.remove('(');
             }

              if(str.charAt(i)=='}'){
                set.remove('{');
             }

              if(str.charAt(i)==']'){
                set.remove('[');
             }
        }

        if(set.isEmpty()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }


    }
}