import java.util.*;
public class Q37{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String S=in.next();
String T=in.next();
int count=0;
int counting=0;
for(int i=0;i<T.length();i++){
if(Character.isLowerCase(T.charAt(i))){
if(S.charAt(i)==T.charAt(i)){
count++;
}
}

if(Character.isUpperCase(T.charAt(i))){
counting++;
char c=Character.toLowerCase(T.charAt(i));

if(c==S.charAt(i)){
count++;
}
}
}

if(count==S.length()){
System.out.print("Verified"+" "+counting);
}else{
System.out.println("Mismatch"+" "+counting);
}

}
}