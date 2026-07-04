package Endgame;
import java.util.*;
public class Q30{
public static void main(String args[]){
Scanner in=new Scanner(System.in);

int n=in.nextInt();
int arr[]=new int[n];
int k=in.nextInt();
for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

HashMap<Integer,Integer> map=new HashMap<>();

map.put(0,1);

int sum=0,count=0;

for(int i=0;i<n;i++){

sum=sum+arr[i];

if(map.containsKey(sum-k)){
count=count+map.get(sum-k);
}

map.put(sum,map.getOrDefault(sum,0)+1);

}

System.out.println(count);

}
}