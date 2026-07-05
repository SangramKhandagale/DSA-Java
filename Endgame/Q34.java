package Endgame;
import java.util.*;
public class Q34{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String str1=in.next();
String str2=in.next();

String str=str1+str1;

if(str.contains(str2)){
System.out.println("Yes");
}else{
System.out.println("No");
}

}
}