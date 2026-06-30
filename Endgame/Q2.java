import java.util.*;
public class Q2{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();

String str=String.valueOf(n);
int i=0,j=str.length()-1;
boolean result=true;

while(i<=j){
if(str.charAt(i)==str.charAt(j)){
i++;
j--;
}else if(i==j){
System.out.println("Almost");
}else{
result=false;
break;
}
}

System.out.println(result);

}
}