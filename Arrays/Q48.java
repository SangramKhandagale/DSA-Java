import java.util.*;
public class Q48{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
int k=in.nextInt();

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int max=0;
int alpha=0,beta=0;

HashMap<Integer,Integer> map=new HashMap<>();

for(int i=0;i<n;i++){
map.put(arr[i],i);
}

int count=0;

for(int i=0;i<n;i++){
int num=arr[i]+k;

if(map.containsKey(num)){
count++;
int distance=map.get(num)-i;

if(distance>max){
max=distance;
alpha=i;
beta=map.get(num);
}
}

}

System.out.println(count+" "+alpha+" "+beta);

}
}