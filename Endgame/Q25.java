package Endgame;
import java.util.*;
public class Q25{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String str=in.next();
Boolean result=true;
int count=0;
String new_str="";

for(int i=0;i<str.length()-1;i++){

if(str.charAt(i)!='.'){
new_str=new_str+str.charAt(i);
count++;
}else{

if(new_str.charAt(0)=='0'){
result=false;
break;
}

int num=Integer.parseInt(new_str);

if(num<0 || num>255){
result=false;
break;
}

new_str="";

}

}

if(result){
System.out.println("Valid");
}else{
System.out.println("Invalid");
}

}
}