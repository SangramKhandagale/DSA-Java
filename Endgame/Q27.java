package Endgame;
import java.util.*;
public class Q27{
public static void main(String args[]){
Scanner in=new Scanner(System.in);

int n=in.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

HashMap<Integer,Integer> map=new HashMap<>();

map.put(0,1);

int sum=0;

for(int i=0;i<n;i++){
sum=sum+arr[i];

if(map.containsKey(sum)){
int start=map.get(sum)+1;
int end=i;

System.out.println(start+" "+end);
}

if(!map.containsKey(sum)){
map.put(sum,i);
}

}



}
}