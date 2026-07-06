package Endgame;
import java.util.*;
public class Q59{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      
        int arr[]=new int[n];

        
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }

  int max_count=0;

  for(int i=0;i<n;i++){
int num1=arr[i];
int count=0;

for(int j=i+1;j<n;j++){
if(arr[j]>num1){
    num1=arr[j];
    count+=1;
}

if(count>max_count){
    max_count=count;
}
}

  }

  System.out.println(max_count+1);

    }
}