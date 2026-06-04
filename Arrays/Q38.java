import java.util.*;
public class Q38{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int min_len=0;
int start=0;
int max_sum=0;

for(int i=0;i<n;i++){
int len=0;
int sum=0;

for(int j=i;j<n;j++){
sum=sum+arr[j];
if(sum>max_sum){
max_sum=sum;
min_len++;
start=i+1;
}
}
}

if(max_sum>0){
System.out.print(max_sum+" "+start+" "+min_len);
}else{
System.out.print("No harvest");
}

}
}