import java.util.*;
public class Q11{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
HashMap<Character,Integer> map=new HashMap<>();
String str=in.next();

for(int i=0;i<str.length();i++){
map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
}

for(Map.Entry<Character,Integer> e:map.entrySet()){
System.out.println(e.getKey()+" "+e.getValue());
}

for(int i=0;i<str.length();i++){
char ch=str.charAt(i);

if(map.get(ch)==1){
System.out.println(ch);
break;
}
}

}
}