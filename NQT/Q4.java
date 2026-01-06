package NQT;
import java.util.*;
public class Q4{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String str=in.next();

HashMap<Character,Integer> freq=new HashMap<>();
HashMap<Character,Integer> FI=new HashMap<>();
HashMap<Character,Integer> LI=new HashMap<>();

for(int i=0;i<str.length();i++){
freq.put(str.charAt(i),freq.getOrDefault(str.charAt(i),0)+1);
}

for(int i=0;i<str.length();i++){
if(!FI.containsKey(str.charAt(i))){
FI.put(str.charAt(i),i);
}
}

for(int i=str.length()-1;i>=0;i--){
if(!LI.containsKey(str.charAt(i))){
LI.put(str.charAt(i),i);
}
}


for(Map.Entry<Character,Integer> e:freq.entrySet()){
    Character c=e.getKey();
int first=FI.get(c);
int last=LI.get(c);

if(e.getValue()>1 && Math.abs(first-last)%2==0){
System.out.println(e.getKey());
}
}


}
}