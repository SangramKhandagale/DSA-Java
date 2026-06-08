import java.util.*;
public class Q46{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];

int max_len=0;
int sum=0;
int count=0;
int start=0;

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

for(int i=0;i<n;i++){
int len=0;

for(int j=i;j<n;j++){
sum=sum+arr[j];
len++;

if(sum==0){
count++;

if(len>max_len){
max_len=len;
start=i+1;
}
}

}

sum=0;
}

System.out.println(count+" "+max_len+" "+start);


}
}