import java.util.*;
public class Q40{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();

int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int max_len=1;

for(int i=0;i<n;i++){
int len=1;
int small=arr[i];

for(int j=i+1;j<n;j++){
if(small<arr[j]){
len++;
small=arr[j];
}
}


if(len>max_len){
max_len=len;
}


}

System.out.println(max_len);

}
}