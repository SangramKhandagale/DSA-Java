package Endgame;
import java.util.*;
public class Q29{
public static void main(String args[]){
Scanner in=new Scanner(System.in);

int n=in.nextInt();
String arr[]=new String[n];

for(int i=0;i<n;i++){
arr[i]=in.next();
}

HashMap<String,Integer> map=new HashMap<>();

for(int i=0;i<n;i++){
map.put(arr[i],map.getOrDefault(arr[i],0)+1);
}

int k=in.nextInt();
int max=0;
String max_S="";

for(int i=0;i<k;i++){

for(Map.Entry<String,Integer> e:map.entrySet()){
if(e.getValue()>max){
max=e.getValue();
max_S=e.getKey();
}

}

System.out.print(max_S+" ");
map.remove(max_S);
max_S="";
max=0;

}



}
}