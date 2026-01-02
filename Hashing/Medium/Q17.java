package Hashing.Medium;
import java.util.*;
public class Q17{
   public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   int arr[][]=new int[n][n];
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
     arr[i][j]=in.nextInt();
    }
    }

    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    System.out.print( arr[i][j]+" ");
    }
    System.out.println();
    }

    HashMap<String,Integer> map=new HashMap<>();

    for(int i=0;i<n;i++){
    String str="";
    for(int j=0;j<n;j++){
    str=str+arr[i][j];
    }
    map.put(str, map.getOrDefault(str, 0)+1);
}

int count=0;

for(int j=0;j<n;j++){
    String str1="";
    for(int i=0;i<n;i++){
    str1=str1+arr[i][j];
    }
   if( map.containsKey(str1)){
    count=count+map.get(str1);
   }
}

// for(Map.Entry<String,Integer> e:map.entrySet()){
//     System.out.println(e.getKey()+" "+e.getValue());
// }
System.out.println();
System.out.println(count);
   }
}