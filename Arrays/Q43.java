import java.util.*;
public class Q43{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int max=Integer.MIN_VALUE;
int sum=0;
int diff=Integer.MIN_VALUE;
int start=1;

for(int i=0;i<n;i++){
max=Math.max(arr[i],max);

int r=max-arr[i];

if(r>diff){
diff=r;
start=i;
}

sum=sum+r;
}

System.out.print(sum+" "+(start+1));


}
}