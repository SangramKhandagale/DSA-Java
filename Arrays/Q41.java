import java.util.*;
public class Q41{

public static int Kadane(int arr[],int start,int end){
int curr=arr[start];
int best=arr[start];

for(int i=start+1;i<=end;i++){
curr=Math.max(arr[i],arr[i]+curr);
best=Math.max(curr,best);
}

return best;
}

public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}

int ans=Integer.MIN_VALUE;

for(int split=0;split<n-1;split++){
int leftbest=Kadane(arr,0,split);
int rightbest=Kadane(arr,split+1,n-1);

ans=Math.max(ans,leftbest+rightbest);
}

System.out.println(ans);

}
}