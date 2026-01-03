package Hashing.Easy;
import java.util.*;
public class Q12{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
ArrayList<String> list=new ArrayList<>();
        permute("",s1,list);

        System.out.println(list);

        boolean result=false;

        for(int i=0;i<list.size();i++){
            String per=list.get(i);
           if(s2.contains(per)){
            result=true;
           }
        }

        System.out.println(result);
    }

    public static void permute(String prefix,String remaining,ArrayList<String> list){
        if(remaining.length()==0){
            list.add(prefix);
        }

        for(int i=0;i<remaining.length();i++){
        char ch=remaining.charAt(i);
        String newPrefix=prefix+ch;
        String newRemaining=remaining.substring(0,i)+remaining.substring(i+1);

        permute(newPrefix, newRemaining, list);
        }
    }
}