package NQT;
import java.util.*;
public class Q5{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

HashMap<Integer,Integer> freq=new HashMap<>();
HashMap<Integer,Integer> FI=new HashMap<>();
HashMap<Integer,Integer> LI=new HashMap<>();

for(int i=0;i<n;i++){
freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
}

int sum=0;

for(Map.Entry<Integer,Integer> e:freq.entrySet()){
sum=sum+e.getValue();
}

double avg=(double)sum/freq.size();

for(int i=0;i<n;i++){
if(!FI.containsKey(arr[i])){
FI.put(arr[i],i);
}
}

for(int i=n-1;i>=0;i--){
if(!LI.containsKey(arr[i])){
LI.put(arr[i],i);
}
}

int count=0;

for(Map.Entry<Integer,Integer> e:freq.entrySet()){
    int key=e.getKey();
int first=FI.get(key);
int last=LI.get(key);
if(e.getValue()>avg && first%2==0 && last%2==1){
count+=1;
}
}

System.out.println(count);

}

}