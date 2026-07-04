package Endgame;
import java.util.*;
public class Q23{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();

int steps=0;

while(b!=0){
    int temp=b;
a=a%b;
b=a;
a=temp;
steps++;
}

System.out.println("GCD="+a+" Steps="+steps);

}
}