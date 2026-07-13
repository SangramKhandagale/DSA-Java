package Endgame;
import java.util.*;
public class Q52{
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

int max=0;

ArrayList<Integer> list=new ArrayList<>();

for(Map.Entry<Integer,Integer> e:map.entrySet()){
if(e.getValue()>max){
max=e.getValue();
}
}

for(Map.Entry<Integer,Integer> e:map.entrySet()){
if(e.getValue()==max){
list.add(e.getKey());
}
}

Collections.sort(list);

System.out.println(list.get(0));

}
}