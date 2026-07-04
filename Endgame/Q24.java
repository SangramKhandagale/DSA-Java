package Endgame;
import java.util.*;
public class Q24{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String str=in.next();
HashMap<Character,Integer> map=new HashMap<>();

char c=str.charAt(0);
int count=1;
String new_str="";

for(int i=1;i<str.length();i++){

if(str.charAt(i)==c){
count++;
}else{
new_str=new_str+c+count;
c=str.charAt(i);
count=1;
}

if(i==str.length()-1){
    new_str=new_str+c+count;
}

}

System.out.println(new_str);

}
}