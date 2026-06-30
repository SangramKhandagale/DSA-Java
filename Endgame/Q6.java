package Endgame;
import java.util.*;
public class Q6{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr1[]=new int[n];

for(int i=0;i<n;i++){
arr1[i]=in.nextInt();
}

int m=in.nextInt();
int arr2[]=new int[m];

for(int i=0;i<m;i++){
arr2[i]=in.nextInt();
}


int arr[]=new int[n+m];

for(int i=0;i<n;i++){
arr[i]=arr1[i];
}

 for(int i=0;i<m;i++){
arr[n+i]=arr2[i];
 }

Arrays.sort(arr);

HashSet<Integer> set=new HashSet<>();

 for(int i=0;i<m+n;i++){
set.add(arr[i]);
 }

 int duplicate=arr.length-set.size();

System.out.println(set+" "+duplicate);


}
}