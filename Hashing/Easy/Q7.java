package Hashing.Easy;
import java.util.*;
public class Q7{
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

HashSet<Integer> set=new HashSet<>();

for(int i=0;i<n;i++){
    set.add(arr1[i]);
}

HashSet<Integer> result=new HashSet<>();

for(int i=0;i<m;i++){
if(set.contains(arr2[i])){
    result.add(arr2[i]);
}
}

System.out.println(result);
    }
}