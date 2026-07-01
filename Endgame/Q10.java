import java.util.*;
public class Q10{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String s1=in.nextLine();
String s2=in.nextLine();

HashMap <Character,Integer> map1=new HashMap<>();
HashMap <Character,Integer> map2=new HashMap<>();

for(int i=0;i<s1.length();i++){
    char c=s1.charAt(i);

    if(Character.isUpperCase(c)){
        c=Character.toLowerCase(c);
    }

map1.put(c,map1.getOrDefault(c,0)+1);
}

for(int i=0;i<s2.length();i++){
    char c=s2.charAt(i);

    if(Character.isUpperCase(c)){
        c=Character.toLowerCase(c);
    }

map2.put(c,map2.getOrDefault(c,0)+1);
}

if(map1.equals(map2)){
System.out.println("Twins");
}else{
System.out.println("Not Twins");
}

}
}