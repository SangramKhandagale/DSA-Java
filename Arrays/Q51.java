import java.util.*;
public class Q51{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
int k=in.nextInt();

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int count=0,max_len=Integer.MAX_VALUE,start=0;


for(int i=0;i<n;i++){
int sum=0;
int len=0;

for(int j=i;j<n;j++){
sum=sum+arr[j];
len++;

if(sum==k){
count++;

if(len<max_len){
max_len=len;
start=i+1;
}
}

}
}

System.out.println(count+" "+max_len+" "+start);

}
}