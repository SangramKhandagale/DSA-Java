package Endgame;
import java.util.*;

public class Q72{
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);

int n=in.nextInt();
int m=in.nextInt();

int arr1[]=new int[n];
int arr2[]=new int[m];

for(int i=0;i<n;i++){
arr1[i]=in.nextInt();
}

for(int i=0;i<m;i++){
arr2[i]=in.nextInt();
}

PriorityQueue<Integer> pq=new PriorityQueue<>();

for(int x:arr1){
    pq.add(x);
}

for(int x:arr2){
    pq.add(x);
}

for(int i=0;i<n+m;i++){
    System.out.println(pq.poll()+" ");
}

    }
}