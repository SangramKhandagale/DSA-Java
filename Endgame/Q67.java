package Endgame;
import java.util.*;
public class Q67{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
HashSet<Integer> set=new HashSet<>();
for(int i=1;i<n-1;i++){
int left=arr[i-1];
int right=arr[i+1];

int curr=Math.max(left,right);

int peek=Math.max(curr,arr[i]);

if(peek==arr[i]){
    set.add(arr[i]);
}
}

System.out.println(set);

    }
}