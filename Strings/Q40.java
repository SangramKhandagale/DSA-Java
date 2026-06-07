import java.util.*;
public class Q40{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String str=in.next();

HashMap<Character,Integer> map=new HashMap<>();

for(int i=0;i<str.length();i++){
map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
}
int count=0;
for(Map.Entry<Character,Integer> e:map.entrySet()){
if(e.getValue()==1){
count++;
}
}

Character c=' ';

for(int i=0;i<str.length();i++){
int n=map.get(str.charAt(i));

if(n==1){
c=str.charAt(i);
break;
}
}

if(count!=0){
    System.out.println(c+" "+count);
}else{
    System.out.println("#"+" "+count);
}

}
}