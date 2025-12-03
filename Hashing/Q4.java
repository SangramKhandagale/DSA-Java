package Hashing;
import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        HashMap <Character,Integer> map=new HashMap<>();
for(int i=0;i<str.length();i++){
    map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
}    


for(int i=0;i<str.length();i++){
   char ch=str.charAt(i);
   if(map.get(ch)==1){
    System.out.println(str.charAt(i));
    break;
   }
}
    }
}