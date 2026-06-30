import java.util.*;
public class Q3{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String str=in.nextLine();
int n=in.nextInt();
int k=Math.abs(n%26);
int i=0;
String new_str="";

while(i<str.length()){
if(str.charAt(i)>='a' && str.charAt(i)<='z' ||str.charAt(i)>='A' && str.charAt(i)<='Z'  ){
char ch=(char)(str.charAt(i)-k);

new_str=new_str+ch;
}else{
char ch=str.charAt(i);
new_str=new_str+ch;
}
i++;
}

System.out.println(new_str);




}
}