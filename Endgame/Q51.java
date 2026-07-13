package Endgame;
import java.util.*;
public class Q51{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[][]=new int[n][n];

int count=1;

for(int i=0;i<n;i++){
if(i==0 || i%2==0){
for(int j=0;j<n;j++){
arr[i][j]=count;
count++;
}
}else if(i%2!=0){
for(int j=n-1;j>=0;j--){
arr[i][j]=count;
count++;
}
}
}

for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(arr[i][j]+" ");
}
}

}
}