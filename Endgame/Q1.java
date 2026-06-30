import java.util.*;
public class Q1{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int i=0;;

while(n>10){

int sum=0;

while(n>0){
int r=n%10;
sum=sum+r;
n=n/10;
}

i++;
n=sum;

}

System.out.println(n+" "+i);

}
}