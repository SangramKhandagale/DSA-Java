import java.util.*;
public class Q33{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String str=in.nextLine();
String T=in.next();

HashSet<Character> set=new HashSet<>();

for(int i=0;i<T.length();i++){
set.add(T.charAt(i));
}

String new_str="";

for(int i=0;i<str.length();i++){
new_str=new_str+str.charAt(i);
if(set.contains(str.charAt(i))){
set.remove(str.charAt(i));
}

if(set.isEmpty()){
break;
}

}

System.out.println(new_str);

}
}