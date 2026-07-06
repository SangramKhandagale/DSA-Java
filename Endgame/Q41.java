package Endgame;
import java.util.*;
public class Q41{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();

ArrayList<Integer> list=new ArrayList<>();
int counts=0;



for(int i=2;i<=n;i++){
int count=0;

for(int j=2;j<=i;j++){
    if(i%j==0){
        count++;
    }
}

if(count==1){
    list.add(i);
    counts++;
}
}

System.out.println(counts+" "+list);

}
}