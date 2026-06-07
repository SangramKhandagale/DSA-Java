import java.util.*;
public class Q44{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();

int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int surplus=0,deficit=0;

for(int i=1;i<n-1;i++){
int left=i-1;
int right=i+1;

if(arr[i]>arr[left] && arr[i]>arr[right]){
System.out.print((i+1)+" ");
surplus=surplus+arr[i];
}
}

for(int i=1;i<n-1;i++){
int left=i-1;
int right=i+1;

if(arr[i]<arr[left] && arr[i]<arr[right]){
System.out.print((i+1)+" ");
deficit=deficit+arr[i];
}
}

int total=surplus-deficit;

if(surplus==0 && deficit==0){
    System.out.println("NONE NONE 0");
}else{
System.out.print(total);
}

}
}