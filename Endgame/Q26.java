package Endgame;
import java.util.*;
public class Q26{
public static void main(String args[]){
Scanner in=new Scanner(System.in);

int n=in.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

HashMap<Integer,Integer> map=new HashMap<>();

for(int i=0;i<n;i++){
map.put(arr[i],map.getOrDefault(arr[i],0)+1);
}

double cutoff=n/2;
int max=0;
int max_c=0;

for(Map.Entry<Integer,Integer> e:map.entrySet()){
if(e.getValue()>cutoff){
if(e.getValue()>max){
max=e.getValue();
max_c=e.getKey();
}
}
}

if(max!=0){
    System.out.println(max_c);
}else{
    System.out.println("No winner");
}

}
}