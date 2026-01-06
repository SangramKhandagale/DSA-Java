package NQT;
import java.util.*;

public class Q3{
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

int dis=0;

for(Map.Entry<Integer,Integer> e:map.entrySet()){
dis=dis+1;
}

double avg=(double)arr.length/dis;

int count=0;

for(Map.Entry<Integer,Integer> e:map.entrySet()){
if(e.getValue()>avg){
count+=1;
}
}

System.out.println(avg);


}
}