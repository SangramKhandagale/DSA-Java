package Endgame;
import java.util.*;
public class Q42{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int steps=0,max=1;

while(n!=1){
if(n%2==0){
n=n/2;
steps++;

if(n>max){
max=n;
}
}else{
n=n*3+1;
steps++;

if(n>max){
max=n;
}
}
}

System.out.println("Steps="+steps+" Max="+max);

}
}