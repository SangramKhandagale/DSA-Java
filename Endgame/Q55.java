package Endgame;
import java.util.*;
public class Q55{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
int n=in.nextInt();
int m=in.nextInt();
int o=in.nextInt();

int arr1[]=new int[n];
int arr2[]=new int[m];
int arr3[]=new int[o];

for(int i=0;i<n;i++){
    arr1[i]=in.nextInt();
}

for(int i=0;i<m;i++){
    arr2[i]=in.nextInt();
}

for(int i=0;i<o;i++){
    arr3[i]=in.nextInt();
}

int i=0,j=0,k=0;

int itr1=0;
int itr2=0;
int itr3=0;

int range=Integer.MAX_VALUE;
int L=0,R=0;

while(i<n && j<m && k<o){
    int a=arr1[i];
    int b=arr2[j];
    int c=arr3[k];
    int min=Math.min(a,Math.min(b,c));
    int max=Math.max(a,Math.max(b,c));

    int diff=max-min;

if(diff<range){
    range=diff;
    L=min;
    R=max;
}

if(min==arr1[i]){
    i++;
}else if(min==arr2[j]){
    j++;
}else{
    k++;
}


   
}

System.out.println(L+" "+R);

    }
}