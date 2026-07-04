package Endgame;
import java.util.*;
public class Q28{
public static void main(String args[]){
Scanner in=new Scanner(System.in);

int n=in.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int a[]=new int[n];

for(int i=0;i<n;i++){
int mul=1;
for(int j=0;j<n;j++){
if(arr[j]!=arr[i]){
mul=mul*arr[j];
}
}

a[i]=mul;
}

for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}

}
}