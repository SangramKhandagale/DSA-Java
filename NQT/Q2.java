package NQT;
import java.util.*;

public class Q2{
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

for(Map.Entry<Integer,Integer> e:map.entrySet()){
if(e.getValue()%2==1){
System.out.println(e.getKey());
}
}

}
}