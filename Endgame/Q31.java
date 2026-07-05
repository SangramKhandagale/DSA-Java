package Endgame;
import java.util.*;
public class Q31{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int len=String.valueOf(n).length();
int sum=0;

for(int i=1;i<=n;i++){
int number=n;
int rem=(int)Math.pow(5,i);
int r=number/rem;
sum=sum+r;
}

System.out.println(sum);

}
}