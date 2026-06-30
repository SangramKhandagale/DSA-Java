package Endgame;
import java.util.*;
public class Q5{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];

boolean found=false;

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int key=in.nextInt();

int ch=0;

for(int i=0;i<n;i++){
if(arr[i]==key){
found=true;
ch=i;
}
}


if(found){
    System.out.println(ch);
}else{
    System.out.println(-1);
}



}
}